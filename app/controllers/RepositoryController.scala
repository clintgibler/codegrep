package controllers

import play.api.mvc._
import datasource.SearchDataSource

import scala.concurrent.{ExecutionContext, Future}

class RepositoryController(cc: ControllerComponents, repo: SearchDataSource)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {
  def list: Action[AnyContent] = Action.async { implicit request: Request[AnyContent] =>
    {
      Future {
        Ok("not implemented")
      }
      /*
    repo.getAvailableRepositories.map {
      case Left(failure) => NotFound(failure.toString)
      case Right(document) => Ok(document.toString)
    }
     */
    }
  }
}
