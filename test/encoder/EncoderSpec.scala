package encoder

import models.{CodeModel, CodeSourceModel}
import org.scalatestplus.play._

class EncoderSpec extends PlaySpec {

  "Encoder" must {
    "should choose the correct encoder based on extension" in {
      val code = CodeSourceModel(
        id = "abc",
        repository = "https://github.com/x.git",
        filename = "test/a.java",
        content = "class a { public static void main(String args[]) {} }"
      )
      val encoder: Either[CodeEncoderError, CodeModel] = CodeEncoder.from(code)
      val r = encoder match {
        case Left(failure) => failure.toString
        case Right(codeModel) => codeModel.language
      }
      r mustBe "java"
    }
  }
}
