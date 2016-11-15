package controllers

import play.api.mvc._
import datasource.SearchDataSource
import models.CodeSourceModel

class IndexController(cc: ControllerComponents, repo: SearchDataSource) extends AbstractController(cc) {
  def index() = Action { implicit request: Request[AnyContent] => {
    var json = request.body.asJson
    val res = repo.indexCode(new CodeSourceModel(json.get("id").toString,
      json.get("filename").as[String],json.get("repository").toString,json.get("content").as[String]))
    res match {
      case Left(failure) => NotFound(failure.toString)
      case Right(_) => Ok("Success")
    }
  }
  }
}
