package encoder

import models.{CodeModel, CodeSourceModel, TokenModel}
import org.scalatestplus.play._

class JavaCodeEncoderSpec extends PlaySpec {
  val validJavaClass =
    """package test;
      import java.util.something;
      class App {
        enum Color { RED, GREEN, BLUE; }
        public static void main(String args[]) {
          int i = 0;
        }
      }
    """
  val validJavaInterface =
    """package test;
      public interface hello {
        public String hello = "Hello";
          public void sayHello();
      }
    """

  def extractToken(model: CodeModel, tokenType: String, tokenText: String): String = {
    model.tokens.find((t) => t.tokenType == tokenType && t.text == tokenText) match {
      case Some(t) => t.text
      case _ => "Token not found"
    }
  }

  "JavaCodeEncoder" must {
    "must parse classes correctly " in {
      val code = CodeSourceModel(
        id = "abc",
        repository = "https://github.com/x.git",
        filename = "test/a.java",
        content = validJavaClass
      )
      val encoder: Either[CodeEncoderError, CodeModel] = CodeEncoder.from(code)
      val r = encoder match {
        case Left(failure) => fail(failure.toString)
        case Right(model) =>
          extractToken(model, "class", "App") mustBe "App"
          extractToken(model, "variable", "i") mustBe "i"
          extractToken(model, "method", "main") mustBe "main"
          extractToken(model, "enum", "Color") mustBe "Color"
      }
    }
  }

  "must parse interfaces correctly " in {
    val code = CodeSourceModel(
      id = "abc",
      repository = "https://github.com/x.git",
      filename = "test/a.java",
      content = validJavaInterface
    )
    val encoder: Either[CodeEncoderError, CodeModel] = CodeEncoder.from(code)
    val r = encoder match {
      case Left(failure) => fail(failure.toString)
      case Right(model) =>
        extractToken(model, "interface", "hello") mustBe "hello"
    }
  }

}