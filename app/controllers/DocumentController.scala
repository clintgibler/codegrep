package controllers

import play.api._
import play.api.mvc._
import datasource.SearchDataSource
import models.SearchResultModel

class DocumentController (cc: ControllerComponents, repo: SearchDataSource) extends AbstractController(cc) {
  def document(id: String) = Action { implicit request: Request[AnyContent] => {
    val res = repo.getDocumentById(id)
    res match {
      case Left(failure) => NotFound(failure.toString)
      case Right(document) => Ok(document.toString)
    }
  }
  }
}
