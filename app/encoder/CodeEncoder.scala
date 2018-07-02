package encoder

import java.nio.file.Files

import models.{CodeModel, CodeSourceModel}
import org.antlr.v4.runtime.Token
import org.apache.tika.metadata.Metadata
import org.apache.tika.Tika
import play.api.Logger


abstract class CodeEncoder {
  def parse(content: String): Map[String, Set[Token]]
}

sealed trait CodeEncoderError
object CodeEncoderError {
  final case class OperationFailed(msg: String) extends CodeEncoderError
}

object CodeEncoder {
  def from(source: CodeSourceModel): Either[CodeEncoderError, CodeModel] = {

    // Todo: this needs work - almost all files are detected as octetstream - wtf
    def fromUnknownExt(detector: Tika, source: CodeSourceModel): Either[CodeEncoderError, CodeModel] = {
      val mtype = detector.detect(source.content)
      Logger.info("Filetype: %s, %s".format(source.filename, mtype))
      if(mtype != "text/plain")
        Left(CodeEncoderError.OperationFailed("Unknown file type for file:%s".format(source.filename)))
      else
        Right(new CodeModel(source.id,source.filename,source.repository,source.content, "text", TextCodeEncoder.parse(source.content)))
    }

    val detector = new Tika
    val ext = """.*\.(\w+)$""".r
    source.filename match {
      case ext(fileType) =>
        fileType match {
          case "java" => Right(new CodeModel(source.id,source.filename,source.repository,source.content, "java", JavaCodeEncoder.parse(source.content)))
          case "go" => Right(new CodeModel(source.id,source.filename,source.repository,source.content, "go", GolangCodeEncoder.parse(source.content)))
          case _ => Left(CodeEncoderError.OperationFailed("Unknown file extension for file:%s".format(source.filename)))
        }
      case _ => Left(CodeEncoderError.OperationFailed("Unknown file extension for file:%s".format(source.filename)))
    }
  }
}
