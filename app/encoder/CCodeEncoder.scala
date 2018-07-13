package encoder

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets

import encoder.CPPCodeEncoder.{getTerminalNodeByXPath, tokenToModel}
import models.TokenModel
import org.antlr.v4.runtime.atn.{LexerATNSimulator, ParserATNSimulator, PredictionContextCache}
import org.antlr.v4.runtime.tree._
import org.antlr.v4.runtime._
import parsers.cpp._
import play.api.Logger
import org.antlr.v4.runtime.tree.xpath._

object CCodeEncoder extends CodeEncoder {
  def extractTokens(lexer: CPP14Lexer): List[TokenModel] = {
    val tokens = new collection.mutable.MutableList[TokenModel]
    val parser = new CPP14Parser(new CommonTokenStream(lexer))
    parser.setInterpreter(
      new ParserATNSimulator(parser, parser.getATN, parser.getInterpreter.decisionToDFA, new PredictionContextCache))
    ParseTreeWalker.DEFAULT.walk(
      new CPP14BaseListener() {

        override def enterFunctiondefinition(ctx: CPP14Parser.FunctiondefinitionContext): Unit = {
          tokens ++= getTerminalNodeByXPath(ctx, "//ptrdeclarator/noptrdeclarator/noptrdeclarator//Identifier", parser)
            .map(tokenToModel(_, "function"))
        }

        override def enterInitdeclarator(ctx: CPP14Parser.InitdeclaratorContext): Unit = {
          tokens ++= getTerminalNodeByXPath(ctx, "//Identifier", parser).map(tokenToModel(_, "variable"))
        }

      },
      parser.translationunit()
    )

    tokens.toList
  }

  override def parse(content: String): List[TokenModel] = {
    val stream = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8))
    val lexer = new CPP14Lexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8))
    lexer.setInterpreter(
      new LexerATNSimulator(lexer, lexer.getATN, lexer.getInterpreter.decisionToDFA, new PredictionContextCache))
    extractTokens(lexer)
  }
}
