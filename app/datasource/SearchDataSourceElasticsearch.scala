package datasource

import com.sksamuel.elastic4s.http.HttpClient
import com.sksamuel.elastic4s.http.search.SearchHit
import com.sksamuel.elastic4s.searches.queries.QueryDefinition
import encoder.CodeEncoder
import models._

import scala.concurrent.{ExecutionContext, Future}

class SearchDataSourceElasticsearch(client: HttpClient)
  extends SearchDataSource {


  // TODO(syam): Get these from elasticsearch
  override def getAvailableLanguages: Either[SearchDataSourceError, Seq[String]] = {
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
      case _ => Right(default)
    }
  }

  override def getDocumentById(id: String)(implicit ec: ExecutionContext): Future[Either[SearchDataSourceError, String]] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._
    client.execute {
      get(id).from("codesearch")
    }.map {
      case Left(failure) =>
        Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(data) =>
        if (!data.result.found) Left(SearchDataSourceError.OperationFailed("Not found"))
        else Right(data.result.sourceAsString)
    }
  }

  override def getChecksumById(id: String)(implicit ec:ExecutionContext): Future[Either[SearchDataSourceError, String]] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._
    client.execute {
      get(id).from("status")
    }.map {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(data) =>
        if (!data.result.found) Left(SearchDataSourceError.OperationFailed("Not found"))
        else Right(data.result.sourceAsMap("checksum").toString)
    }
  }

  override def getDocumentByTerm(queryString: Map[String, Seq[String]])(implicit ec: ExecutionContext): Future[Either[SearchDataSourceError, Seq[SearchResultModel]]] = {
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

    client.execute {
      search("codesearch").query(boolQuery.must(queries)).highlighting(highlight("content").fragmentSize(300))
    }.map {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(data) => Right(data.result.hits.hits.map((hit) => hitToSearchDocumentModel(hit)))
    }
  }

  override def updateChecksumById(id: String, checksum: String)(implicit ec:ExecutionContext): Future[Either[SearchDataSourceError, Unit]] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._
    import io.circe.Json
    val json = Json.obj(("checksum", Json.fromString(checksum)))
    client.execute(update(id).in("status" / "status").docAsUpsert(json.toString)).map {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(_) => Right(())
    }
  }

  override def indexCode(source: CodeSourceModel)(implicit ec:ExecutionContext): Future[Either[SearchDataSourceError, Unit]] = {
    CodeEncoder.from(source) match {
      case Left(failure) => Future {
        Left(SearchDataSourceError.OperationFailed("Failed to encode: %s".format(failure.toString)))
      }
      case Right(code) =>
        import com.sksamuel.elastic4s.http.ElasticDsl._
        client.execute(update(code.id).in("codesearch" / "code").docAsUpsert(code.json())).map {
          case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
          case Right(_) => Right(())
        }
    }
  }

  // TODO(syam): Convert this to scroll based API
  override def getAvailableRepositories(implicit ec:ExecutionContext): Future[Either[SearchDataSourceError, Seq[RepositoryModel]]] = {

    def hitToSearchRepositoryModel(hit: SearchHit): RepositoryModel = {
      RepositoryModel(repository = hit.sourceField("repository").toString, path = hit.sourceField("path").toString)
    }

    import com.sksamuel.elastic4s.http.ElasticDsl._
    client.execute {
      search("repositories").size(i = 100000)
    }.map {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(data) => Right(data.result.hits.hits.map((hit) => hitToSearchRepositoryModel(hit)))
    }
  }

}
