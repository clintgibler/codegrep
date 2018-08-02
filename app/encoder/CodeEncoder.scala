package encoder

import models.{CodeModel, CodeSourceModel, TokenModel}

sealed trait CodeEncoderError

object CodeEncoderError {
  final case class OperationFailed(msg: String) extends CodeEncoderError
}

object CodeEncoder {
  def from(source: CodeSourceModel): Either[CodeEncoderError, CodeModel] = {
    val ext = """.*\.(\w+)$""".r
    source.filename match {
      case ext(fileType) =>
        fileType match {
          case "c" | "h" =>
            Right(
              new CodeModel(source.id,
                            source.filename,
                            source.repository,
                            source.content,
                            "c",
                            ClangCodeEncoder.parse(source.content, "." + fileType)))
          case "cpp" | "hpp" =>
            Right(
              new CodeModel(source.id,
                            source.filename,
                            source.repository,
                            source.content,
                            "cpp",
                            ClangCodeEncoder.parse(source.content, "." + fileType)))

          case "java" =>
            Right(
              new CodeModel(source.id,
                            source.filename,
                            source.repository,
                            source.content,
                            "java",
                            JavaCodeEncoder.parse(source.content)))
          case "go" =>
            Right(
              new CodeModel(source.id,
                            source.filename,
                            source.repository,
                            source.content,
                            "go",
                            GolangCodeEncoder.parse(source.content, "." + fileType)))
          case "scala" =>
            Right(
              new CodeModel(source.id,
                            source.filename,
                            source.repository,
                            source.content,
                            "scala",
                            ScalaCodeEncoder.parse(source.content)))
          case "conf" | "cnf" | "txt" =>
            Right(
              new CodeModel(source.id,
                            source.filename,
                            source.repository,
                            source.content,
                            "text",
                            TextCodeEncoder.parse(source.content)))
          case _ =>
            Left(CodeEncoderError.OperationFailed("Unknown file extension for file:%s".format(source.filename)))
        }
      case _ =>
        Left(CodeEncoderError.OperationFailed("Unknown file extension for file:%s".format(source.filename)))
    }
  }
}
