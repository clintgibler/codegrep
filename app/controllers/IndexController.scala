package controllers

import play.api.mvc._
import datasource.SearchDataSource
import models.CodeSourceModel
import play.api.Configuration

class IndexController(cc: ControllerComponents, repo: SearchDataSource, config: Configuration) extends AbstractController(cc) {
  def index() = Action { implicit request: Request[AnyContent] => {
    def impl: Result = {
      var json = request.body.asJson
      val res = repo.indexCode(new CodeSourceModel(json.get("id").toString,
        json.get("filename").as[String], json.get("repository").toString, json.get("content").as[String]))
      res match {
        case Left(failure) => NotFound(failure.toString)
        case Right(_) => Ok("Success")
      }
    }
    if (config.get[Boolean]("node.indexer")) impl else Ok("Not available")
  }
  }
}
