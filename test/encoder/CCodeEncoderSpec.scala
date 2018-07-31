package encoder

import models.{CodeModel, CodeSourceModel}
import org.scalatestplus.play._

class CCodeEncoderSpec extends PlaySpec {
  val validC =
    """#include<stdio.h>
      int main()
      {
        int a = 1;
        println("Hello world: %d", a);
      }
      void mlx4_stop_sense(struct mlx4_dev *dev)
      {
 	       cancel_delayed_work_sync(&mlx4_priv(dev)->sense.sense_poll);
      }"""


  def extractToken(model: CodeModel,
                   tokenType: String,
                   tokenText: String): String = {
    model.tokens.find((t) => t.tokenType == tokenType && t.text == tokenText) match {
      case Some(t) => t.text
      case _       => "Token not found"
    }
  }

  "CCodeEncoder" must {
    "must parse C code correctly " in {
      val code = CodeSourceModel(
        id = "abc",
        repository = "https://github.com/x.git",
        filename = "test/a.c",
        content = validC
      )
      val encoder: Either[CodeEncoderError, CodeModel] = CodeEncoder.from(code)
      val r = encoder match {
        case Left(failure) => fail(failure.toString)
        case Right(model) =>
          extractToken(model, "VarDecl", "a") mustBe "a"
          extractToken(model, "FunctionDecl", "main") mustBe "main"
          extractToken(model, "FunctionDecl", "mlx4_stop_sense") mustBe "mlx4_stop_sense"
      }
    }
  }

}
