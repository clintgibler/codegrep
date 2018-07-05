package controllers

import play.api._
import play.api.mvc._

class VersionController(cc: ControllerComponents) extends AbstractController(cc) {
  def version() = Action { implicit request: Request[AnyContent] =>
    Ok("1.0.0")
  }
}
