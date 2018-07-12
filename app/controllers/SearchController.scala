package controllers

import datasource.SearchDataSource
import io.circe.generic.auto._
import io.circe.syntax._
import models.SearchResultModel
import play.api._
import play.api.mvc._

import scala.concurrent.ExecutionContext

class SearchController(cc: ControllerComponents, repo: SearchDataSource)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {
  def search() = Action.async { implicit request: Request[AnyContent] =>
    {
      Logger.info("Search request: address:%s parameters:%s".format(request.remoteAddress, request.rawQueryString))
      repo.getDocumentByTerm(request.queryString).map {
        case Left(failure) => NotFound(failure.toString)
        case Right(res: Seq[SearchResultModel]) => {
          Ok(res.asJson.toString)
        }
      }
    }
  }

  def languages() = Action { implicit request: Request[AnyContent] =>
    {
      repo.getAvailableLanguages match {
        case Left(failure)           => NotFound(failure.toString)
        case Right(res: Seq[String]) => Ok(res.asJson.toString)
      }
    }
  }

  def identifiers(id: String) = Action { implicit request: Request[AnyContent] =>
    {
      repo.getAvailableIdentifiers(id) match {
        case Left(failure) => NotFound(failure.toString)
        case Right(res)    => Ok(res.asJson.toString)
      }
    }
  }

}
