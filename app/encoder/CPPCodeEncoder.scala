package encoder

import models.TokenModel
import org.antlr.v4.runtime._
import org.antlr.v4.runtime.atn.{LexerATNSimulator, ParserATNSimulator, PredictionContextCache}
import org.antlr.v4.runtime.tree._
import parsers.cpp._
import play.api.Logger

object CPPCodeEncoder extends CodeEncoder {
  def extractTokens(lexer: CPP14Lexer): List[TokenModel] = {
    val tokens = new collection.mutable.MutableList[TokenModel]
    val parser = new CPP14Parser(new CommonTokenStream(lexer))
    parser.setInterpreter(
      new ParserATNSimulator(parser, parser.getATN, parser.getInterpreter.decisionToDFA, new PredictionContextCache))
    ParseTreeWalker.DEFAULT.walk(
      new CPP14BaseListener() {

        override def enterOriginalnamespacedefinition(ctx: CPP14Parser.OriginalnamespacedefinitionContext): Unit = {
          tokens += tokenToModel(ctx.Identifier().getSymbol, "namespace")
        }

        override def enterClassname(ctx: CPP14Parser.ClassnameContext): Unit = {
          tokens ++= getTerminalNodeByXPath(ctx, "//Identifier", parser).map(tokenToModel(_, "class"))
        }

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
    val lexer = new CPP14Lexer(new ANTLRInputStream(content))
    lexer.setInterpreter(
      new LexerATNSimulator(lexer, lexer.getATN, lexer.getInterpreter.decisionToDFA, new PredictionContextCache))
    extractTokens(lexer)
  }
}
