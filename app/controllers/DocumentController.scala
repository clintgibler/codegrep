package controllers

import play.api.mvc._
import datasource.SearchDataSource

import scala.concurrent.ExecutionContext


class DocumentController (cc: ControllerComponents, repo: SearchDataSource) (implicit ec: ExecutionContext) extends AbstractController(cc) {
  def document(id: String): Action[AnyContent] = Action.async { implicit request: Request[AnyContent] => {
    repo.getDocumentById(id).map {
      case Left(failure) => NotFound(failure.toString)
      case Right(document) => Ok(document.toString)
    }
  }
  }
}
