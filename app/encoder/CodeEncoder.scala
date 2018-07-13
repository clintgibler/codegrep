package encoder

import models.{CodeModel, CodeSourceModel, TokenModel}
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.antlr.v4.runtime.tree.xpath.XPath
import org.antlr.v4.runtime.{Parser, ParserRuleContext, RecognitionException, Token}

import scala.collection.mutable

abstract class CodeEncoder {

  def getTerminalNodeByXPath(ctx: ParserRuleContext, xpath: String, parser: Parser): List[Token] = {
    val tokens: mutable.MutableList[Token] = mutable.MutableList()
    XPath
      .findAll(ctx, xpath, parser)
      .forEach((t) => {
        if (t.isInstanceOf[TerminalNodeImpl]) {
          tokens += t.asInstanceOf[TerminalNodeImpl].getSymbol
        }
      })
    tokens.toList
  }

  def tokenToModel(token: Token, tokenType: String): TokenModel = {
    TokenModel(text = token.getText, line = token.getLine, char = token.getCharPositionInLine, tokenType = tokenType)
  }

  def parse(content: String): List[TokenModel]
}

sealed trait CodeEncoderError

object CodeEncoderError {

  final case class OperationFailed(msg: String) extends CodeEncoderError

}

object CodeEncoder {

  def from(source: CodeSourceModel): Either[CodeEncoderError, CodeModel] = {
    try {
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
                              CCodeEncoder.parse(source.content)))
            case "cpp" | "hpp" =>
              Right(
                new CodeModel(source.id,
                              source.filename,
                              source.repository,
                              source.content,
                              "cpp",
                              CPPCodeEncoder.parse(source.content)))

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
                              GolangCodeEncoder.parse(source.content)))
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
    } catch {
      case e: RecognitionException =>
        Left(CodeEncoderError.OperationFailed("ANTLR recognition exception parsing file:%s".format(source.filename)))
      case e: StackOverflowError =>
        Left(CodeEncoderError.OperationFailed("Stack overflow parsing file:%s".format(source.filename)))
    }
  }
}
