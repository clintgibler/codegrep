package encoder

import models.{CodeModel, CodeSourceModel, TokenModel}
import org.scalatestplus.play._

class ScalaCodeEncoderSpec extends PlaySpec {
  val validScalaClass =
    """
       class Point(xc: Int, yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
     x = x + dx
     y = y + dy
   }
   override def toString(): String = "(" + x + ", " + y + ")";
 }"""


  def extractToken(model: CodeModel, tokenType: String, tokenText: String): String = {
    model.tokens.find((t) => t.tokenType == tokenType && t.text == tokenText) match {
      case Some(t) => t.text
      case _ => "Token not found"
    }
  }

  "ScalaCodeEncoder" must {
    "must parse scala classes correctly " in {
      val code = CodeSourceModel(
        id = "abc",
        repository = "https://github.com/x.git",
        filename = "test/a.scala",
        content = validScalaClass
      )
      val encoder: Either[CodeEncoderError, CodeModel] = CodeEncoder.from(code)
      val r = encoder match {
        case Left(failure) => fail(failure.toString)
        case Right(model) =>
          extractToken(model, "class", "Point") mustBe "Point"
          extractToken(model, "variable", "x") mustBe "x"
          extractToken(model, "function", "move") mustBe "move"
      }
    }
  }

}
