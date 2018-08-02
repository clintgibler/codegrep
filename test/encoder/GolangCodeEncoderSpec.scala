package encoder

import models.{CodeModel, CodeSourceModel}
import org.scalatestplus.play._

class GolangCodeEncoderSpec extends PlaySpec {
  val validGolang =
    """
       package main
       import "unknown"
       func somefunction() {
        shortvar := 0
        var x = 2
       }
    """
  def extractToken(model: CodeModel,
                   tokenType: String,
                   tokenText: String): String = {
    model.tokens.find((t) => t.tokenType == tokenType && t.text == tokenText) match {
      case Some(t) => t.text
      case _       => "Token not found"
    }
  }

  "GolangCodeEncoder" must {
    "must parse Go code correctly " in {
      val code = CodeSourceModel(
        id = "abc",
        repository = "https://github.com/x.git",
        filename = "test/a.go",
        content = validGolang
      )
      val encoder: Either[CodeEncoderError, CodeModel] = CodeEncoder.from(code)
      val r = encoder match {
        case Left(failure) => fail(failure.toString)
        case Right(model) =>
          extractToken(model, "variable", "shortvar") mustBe "shortvar"
          extractToken(model, "variable", "x") mustBe "x"
          extractToken(model, "function", "somefunction") mustBe "somefunction"
      }
    }
  }

}
