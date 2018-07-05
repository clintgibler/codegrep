package controllers

import play.api.mvc._
import datasource.SearchDataSource
import models.CodeSourceModel
import play.api.Configuration
import play.api.libs.json.{JsObject, JsValue}

import scala.concurrent.{ExecutionContext, Future}

class IndexController(cc: ControllerComponents, repo: SearchDataSource, config: Configuration) (implicit ec: ExecutionContext)  extends AbstractController(cc) {
  def index() = Action.async { implicit request: Request[AnyContent] => {

    def jsonToModel(json: Option[JsValue]): CodeSourceModel = {
      CodeSourceModel(json.get("id").toString,
        json.get("filename").as[String],
        json.get("repository").toString,
        json.get("content").as[String])
    }

    if (config.get[Boolean]("node.indexer"))
      repo.indexCode(jsonToModel(request.body.asJson)).map {
        case Left(failure) => NotFound(failure.toString)
        case Right(_) => Ok("Success")
      }
    else
      Future {
        Ok("Not available")
      }
  }
  }

}
