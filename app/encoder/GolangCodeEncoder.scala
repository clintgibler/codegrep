package encoder

import models.TokenModel
import org.antlr.v4.runtime.atn.{ParserATNSimulator, PredictionContextCache}
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream, Token}
import parsers.golang._

object GolangCodeEncoder extends CodeEncoder {
  def extractTokens(lexer: GolangLexer): List[TokenModel] = {
    val tokens = new collection.mutable.MutableList[TokenModel]
    val parser = new GolangParser(new CommonTokenStream(lexer))
    parser.setInterpreter(new ParserATNSimulator(parser, parser.getATN, parser.getInterpreter.decisionToDFA, new PredictionContextCache))

    ParseTreeWalker.DEFAULT.walk(new GolangBaseListener() {
      override def enterImportDecl(ctx: GolangParser.ImportDeclContext): Unit = {
      }

      override def enterTypeSpec(ctx: GolangParser.TypeSpecContext): Unit = {
        if (ctx.IDENTIFIER() != null)
          tokens += tokenToModel(ctx.IDENTIFIER().getSymbol, "type")
      }

      override def enterFunctionDecl(ctx: GolangParser.FunctionDeclContext): Unit = {
        if (ctx.IDENTIFIER() != null)
          tokens += tokenToModel(ctx.IDENTIFIER().getSymbol, "function")
      }

      override def enterMethodDecl(ctx: GolangParser.MethodDeclContext): Unit = {
        if (ctx.IDENTIFIER() != null)
          tokens += tokenToModel(ctx.IDENTIFIER().getSymbol, "method")
      }

      override def enterVarDecl(ctx: GolangParser.VarDeclContext): Unit = {
        ctx.varSpec().forEach((x) => {
          x.identifierList().IDENTIFIER().forEach((i) => {
            tokens += tokenToModel(i.getSymbol, "variable")
          })
        })
      }

      override def enterFieldDecl(ctx: GolangParser.FieldDeclContext) {
        ctx.identifierList().IDENTIFIER().forEach((i) => tokens += tokenToModel(i.getSymbol, "field"))
      }

    }, parser.sourceFile())

    tokens.toList
  }

  override def parse(content: String): List[TokenModel] = {
    val lexer = new GolangLexer(new ANTLRInputStream(content))
    extractTokens(lexer)
  }
}
