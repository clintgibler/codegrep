package controllers

import com.sksamuel.elastic4s.searches.queries.term.TermQueryDefinition
import javax.inject._
import play.api._
import play.api.mvc._
import datasource.SearchDataSource
import models.SearchResultModel

import scala.collection.JavaConverters._
import scala.collection.immutable
import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._

class SearchController (cc: ControllerComponents, repo: SearchDataSource) extends AbstractController(cc) {
  def search() = Action { implicit request: Request[AnyContent] => {
    var res = repo.getDocumentByTerm(request.queryString)
    res match {
      case Left(failure) => NotFound(failure.toString)
      case Right(res: Seq[SearchResultModel]) => {
        Ok(res.asJson.toString)
      }
    }
   }
  }
  def languages() = Action { implicit request: Request[AnyContent] => {
    var res = repo.getAvailableLanguages()
    res match {
      case Left(failure) => NotFound(failure.toString)
      case Right(res: Seq[String]) => {
        Ok(res.asJson.toString)
      }
    }
  }
  }

  def identifiers(id: String) = Action { implicit request: Request[AnyContent] => {
    val res = repo.getAvailableIdentifiers(id)
    res match {
      case Left(failure) => NotFound(failure.toString)
      case Right(res) => Ok(res.asJson.toString)
    }
  }
  }

 }
