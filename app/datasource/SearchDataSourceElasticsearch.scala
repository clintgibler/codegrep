package datasource

import com.sksamuel.elastic4s.http.HttpClient
import com.sksamuel.elastic4s.http.search.SearchHit
import com.sksamuel.elastic4s.searches.queries.QueryDefinition
import encoder.CodeEncoder
import models._
import play.api.Logger

import scala.concurrent.{ExecutionContext, Future}

class SearchDataSourceElasticsearch(client: HttpClient)(implicit ec: ExecutionContext) extends SearchDataSource {

  // TODO(syam): Get these from elasticsearch
  override def getAvailableLanguages: Either[SearchDataSourceError, Seq[String]] = {
    Right("c" :: "cpp" :: "go" :: "java" :: "scala" :: "text" :: Nil)
  }

  // TODO(syam): Get these from elasticsearch
  override def getAvailableIdentifiers(language: String): Either[SearchDataSourceError, Seq[String]] = {
    val default = List.empty
    val c = "variable" :: "function" :: default
    val cpp = "class" :: "namespace" :: "variable" :: "function" :: default
    val scala = "class" :: "object" :: "trait" :: "variable" :: default
    val go = "variable" :: "type" :: "function" :: "method" :: default
    val java = "variable" :: "class" :: "method" :: "interface" :: default
    language match {
      case "c"     => Right(c)
      case "cpp"   => Right(cpp)
      case "go"    => Right(go)
      case "java"  => Right(java)
      case "scala" => Right(scala)
      case _       => Right(default)
    }
  }

  override def getDocumentById(id: String): Future[Either[SearchDataSourceError, String]] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._
    client
      .execute {
        get(id).from("codesearch")
      }
      .map {
        case Left(failure) =>
          Left(SearchDataSourceError.OperationFailed(failure.toString))
        case Right(data) =>
          if (!data.result.found) Left(SearchDataSourceError.OperationFailed("Not found"))
          else Right(data.result.sourceAsString)
      }
  }

  override def getChecksumById(id: String): Future[Either[SearchDataSourceError, String]] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._
    client
      .execute {
        get(id).from("status")
      }
      .map {
        case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
        case Right(data) =>
          if (!data.result.found) Left(SearchDataSourceError.OperationFailed("Not found"))
          else Right(data.result.sourceAsMap("checksum").toString)
      }
  }

  override def getDocumentByTerm(
      queryString: Map[String, Seq[String]]): Future[Either[SearchDataSourceError, Seq[SearchResultModel]]] = {

    //TODO: Use char position to highlight - needs different treatment based on whether the offsets are
    //from clang and golang(byte offsets) vs scala and java which are char offsets
    def highlightFromContent(hit: SearchHit, highlightTerm: String, highlightTermType: String): String = {
      var highlight = hit.sourceField("content").toString.substring(0, 300)
      val content = hit.sourceField("content").toString.split('\n').toList
      val tokens = hit.sourceField("tokens").asInstanceOf[List[Map[String, Any]]]
      tokens.foreach(f = (m) => {
        val model = TokenModel(
          m("text").asInstanceOf[String],
          m("line").asInstanceOf[Int],
          m("char").asInstanceOf[Int],
          m("type").asInstanceOf[String]
        )
        if (model.text == highlightTerm && model.tokenType == highlightTermType) {
          val line = model.line - 1
          if (content.length > line) {
            highlight = content(model.line - 1) // line is 1-indexed
            highlight = highlight.replaceAll(highlightTerm, "<em>" + highlightTerm + "</em>")

            val from = if (line - 5 > 0) line - 5 else 0
            val end = if (line + 5 < content.length) line + 5 else content.length - 1

            var highlightContext = content.slice(from, line - 1)
            highlightContext ::= highlight
            highlightContext ++= content.slice(line + 1, end)
            highlight = highlightContext.mkString("\n")
          }
        }
      })
      highlight
    }

    def makeHighlight(hit: SearchHit, highlightTerm: String, highlightTermType: String): String = {
      if (hit.highlight != null && hit.highlight.contains("content")) {
        hit.highlight("content").mkString
      } else {
        highlightFromContent(hit, highlightTerm, highlightTermType)
      }
    }

    def hitToSearchDocumentModel(hit: SearchHit,
                                 highlightTerm: String,
                                 highlightTermType: String): SearchResultModel = {
      SearchResultModel(
        id = hit.id,
        filename = hit.sourceField("filename").toString,
        repository = hit.sourceField("repository").toString,
        content = hit.sourceField("content").toString,
        highlight = makeHighlight(hit, highlightTerm, highlightTermType)
      )
    }

    import com.sksamuel.elastic4s.http.ElasticDsl._

    var queries: List[QueryDefinition] = List()
    var nestedQueries: List[QueryDefinition] = List()
    var nested = nestedQuery("tokens")
    var highlightTerm = "content"
    var highlightTermType = ""

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
              boolQuery()
                .should(
                  termQuery("repository", v.mkString.toLowerCase()),
                  termQuery("repository.raw", v.mkString.toLowerCase())
                )
                .minimumShouldMatch(1) :: queries
          case "tokens.text" =>
            highlightTerm = v.mkString
            nestedQueries = termQuery(k, v.mkString) :: nestedQueries
          case "tokens.type" =>
            highlightTermType = v.mkString
            nestedQueries = termQuery(k, v.mkString) :: nestedQueries
          case _ =>
        }
    }
    queries = nested.query(boolQuery().must(nestedQueries)) :: queries

    client
      .execute {
        search("codesearch").query(boolQuery.must(queries)).highlighting(highlight("content").fragmentSize(300))
      }
      .map {
        case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
        case Right(data) =>
          Right(data.result.hits.hits.map((hit) => hitToSearchDocumentModel(hit, highlightTerm, highlightTermType)))
      }
  }

  override def updateChecksumById(id: String, checksum: String): Future[Either[SearchDataSourceError, Unit]] = {
    import com.sksamuel.elastic4s.http.ElasticDsl._
    import io.circe.Json
    val json = Json.obj(("checksum", Json.fromString(checksum)))
    client.execute(update(id).in("status" / "status").docAsUpsert(json.toString)).map {
      case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
      case Right(_)      => Right(())
    }
  }

  override def indexCode(source: CodeSourceModel): Future[Either[SearchDataSourceError, Unit]] = {
    CodeEncoder.from(source) match {
      case Left(failure) =>
        Future {
          Left(SearchDataSourceError.OperationFailed("Failed to encode: %s".format(failure.toString)))
        }
      case Right(code) =>
        import com.sksamuel.elastic4s.http.ElasticDsl._
        client.execute(update(code.id).in("codesearch" / "code").docAsUpsert(code.json())).map {
          case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
          case Right(_)      => Right(())
        }
    }
  }

  // TODO(syam): Convert this to scroll based API
  override def getAvailableRepositories: Future[Either[SearchDataSourceError, Seq[RepositoryModel]]] = {

    def hitToSearchRepositoryModel(hit: SearchHit): RepositoryModel = {
      RepositoryModel(repository = hit.sourceField("repository").toString, path = hit.sourceField("path").toString)
    }

    import com.sksamuel.elastic4s.http.ElasticDsl._
    client
      .execute {
        search("repositories").size(i = 100000)
      }
      .map {
        case Left(failure) => Left(SearchDataSourceError.OperationFailed(failure.toString))
        case Right(data)   => Right(data.result.hits.hits.map((hit) => hitToSearchRepositoryModel(hit)))
      }
  }

}
