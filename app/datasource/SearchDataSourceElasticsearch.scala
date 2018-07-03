package datasource

import com.sksamuel.elastic4s.ElasticsearchClientUri
import com.sksamuel.elastic4s.http.HttpClient
import com.sksamuel.elastic4s.http.search.{SearchHit, SearchResponse}
import com.sksamuel.elastic4s.searches.{Highlight, HighlightFieldDefinition}
import com.sksamuel.elastic4s.searches.queries.{NestedQueryDefinition, QueryDefinition}
import com.sksamuel.elastic4s.searches.queries.term.TermQueryDefinition
import models._
import encoder.CodeEncoder
import play.api.Logger

class SearchDataSourceElasticsearch(client: HttpClient)
  extends SearchDataSource {

  def hitToSearchDocumentModel(hit: SearchHit): SearchResultModel = {
    // Hate nulls
    val highlight = if (hit.highlight != null && hit.highlight.contains("content")) {
      hit.highlight("content").mkString
    }
    else {
      hit.sourceField("content").toString.slice(0, 600)
    }

     SearchResultModel(id = hit.id,
      filename = hit.sourceField("filename").toString,
      repository = hit.sourceField("repository").toString,
      content = hit.sourceField("content").toString,
      highlight = highlight)
  }

  // TODO(syam): Get these from elasticsearch
  override def getAvailableLanguages(): Either[SearchDataSourceError, Seq[String]] = {
     Right("go" :: "java" :: "text" :: Nil)
  }

  // TODO(syam): Get these from elasticsearch
  override def getAvailableIdentifiers(language: String): Either[SearchDataSourceError, Seq[String]] = {
    val default = List.empty
    val go = "variable" :: "type" :: "function" :: "method" :: default
    val java = "variable" :: "package" :: "import" :: "class" :: "variable" :: "method" :: "enum" :: "interface" :: "annotation" :: default
    language match {
      case "go" => Right(go)
      case "java" => Right(java)
      case _ =>  Right(default)
    }
  }

  def hitToSearchRepositoryModel(hit: SearchHit): RepositoryModel = {
     RepositoryModel(repository = hit.sourceField("repository").toString, path = hit.sourceField("path").toString)
  }

  override def initialize(): Either[SearchDataSourceError, Unit] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._

    val resp = client.execute {
      createIndex("datasource").mappings(
        mapping("repository").fields(textField("url"), textField("path"))
      )
    }.await

    var ret: Either[SearchDataSourceError, Unit] = resp match {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(_) =>
        Right(())
    }
    ret
  }

  override def getDocumentById(id: String): Either[SearchDataSourceError, String] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._
    val resp = client.execute {
      get(id).from("codesearch")
    }.await

    val ret: Either[SearchDataSourceError, String] = resp match {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(data) => {
        if (!data.result.found) {
          return Left(SearchDataSourceError.OperationFailed("Not found"))

        }
        Right(data.result.sourceAsString)
      }
    }
    ret
  }

  override def getChecksumById(id: String): Either[SearchDataSourceError, String] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._
    val resp = client.execute {
      get(id).from("status")
    }.await

    val ret: Either[SearchDataSourceError, String] = resp match {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(data) =>
        if (!data.result.found) {
          return Left(SearchDataSourceError.OperationFailed("Not found"))
        }
        Right(data.result.sourceAsMap("checksum").toString)
    }
    ret
  }

  override def getDocumentByTerm(queryString: Map[String, Seq[String]]): Either[SearchDataSourceError, Seq[SearchResultModel]] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._

    var queries: List[QueryDefinition] = List()
    var nestedQueries: List[QueryDefinition] = List()
    var nested = nestedQuery("tokens")

    queryString.foreach {
      case (k, v) =>
        k match {
          case "content" =>
            queries = termQuery("content", v.mkString.toLowerCase()) :: queries
          case "language" => queries = termQuery("language", v.mkString.toLowerCase()) :: queries
          // We store "repository" field both analyzed (ie tokenized on whitespace) and as exact string
          // This allows us to match both exact url or just a part of url
          case "repository" =>
            queries =
              boolQuery().should(
                termQuery("repository", v.mkString.toLowerCase()),
                termQuery("repository.raw", v.mkString.toLowerCase())
              ).minimumShouldMatch(1) :: queries
          case "tokens.text" =>
            nestedQueries = termQuery(k, v.mkString) :: nestedQueries
          case "tokens.type" =>
            nestedQueries = termQuery(k, v.mkString) :: nestedQueries
          case _ =>
        }
    }

    queries = nested.query(boolQuery().must(nestedQueries)) :: queries

    val resp = client.execute {
      search("codesearch").query(boolQuery.must(queries)).highlighting(highlight("content").fragmentSize(300))
    }.await

    var ret: Either[SearchDataSourceError, Seq[SearchResultModel]] = resp match {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(data) => {
        var ret = data.result.hits.hits.map((hit) => hitToSearchDocumentModel(hit))
        Right(ret)
      }
    }
    ret
  }

  override def updateChecksumById(id: String, checksum: String): Either[SearchDataSourceError, Unit] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._
    import io.circe.Json
    val json = Json.obj(("checksum", Json.fromString(checksum)))
    val resp = client.execute(update(id).in("status" / "status").docAsUpsert(json.toString)).await
    var ret: Either[SearchDataSourceError, Unit] = resp match {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(_) => Right(())
    }
    ret
  }

  override def indexCode(source: CodeSourceModel): Either[SearchDataSourceError, Unit] = {
    CodeEncoder.from(source) match {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed("Failed to encode: %s".format(failure.toString)))
      case Right(code) =>
        import com.sksamuel.elastic4s.http.ElasticDsl._
        val resp = client.execute(update(code.id).in("codesearch" / "code").docAsUpsert(code.json())).await
        var ret: Either[SearchDataSourceError, Unit] = resp match {
          case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
          case Right(_) => Right(())
        }
        ret
    }
  }
  // TODO(syam): Convert this to scroll based API
  override def getAvailableRepositories(): Either[SearchDataSourceError, Seq[RepositoryModel]] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._

    val resp = client.execute {
      search("repositories").size(i = 100000)
    }.await

    var ret: Either[SearchDataSourceError, Seq[RepositoryModel]] = resp match {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(data) =>
        var ret = data.result.hits.hits.map((hit) => hitToSearchRepositoryModel(hit))
        Right(ret)
    }
    ret
  }

}
