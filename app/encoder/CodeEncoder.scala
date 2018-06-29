package encoder

import models.{CodeModel, CodeSourceModel}
import org.antlr.v4.runtime.Token

abstract class CodeEncoder {
  def parse(content: String): Map[String, Set[Token]]
}

sealed trait CodeEncoderError
object CodeEncoderError {
  final case class OperationFailed(msg: String) extends CodeEncoderError
}

object CodeEncoder {
  def from(source: CodeSourceModel): Either[CodeEncoderError, CodeModel] = {
    val ext = """.*\.(\w+)$""".r
    source.filename match {
      case ext(fileType) => {
        fileType match {
          case "java" => Right(new CodeModel(source.id,source.filename,source.repository,source.content, "java", JavaCodeEncoder.parse(source.content)))
          case "go" => Right(new CodeModel(source.id,source.filename,source.repository,source.content, "go", GolangCodeEncoder.parse(source.content)))
          case "xml" => Right(new CodeModel(source.id,source.filename,source.repository,source.content, fileType, TextCodeEncoder.parse(source.content)))
          case _ => Left(CodeEncoderError.OperationFailed("Unknown file extension"))
        }
      }
      case _ => Left(CodeEncoderError.OperationFailed("Unknown file extension"))
    }
  }
}
