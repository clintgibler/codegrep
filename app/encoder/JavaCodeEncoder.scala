package encoder

import models.TokenModel
import org.antlr.v4.runtime.atn.{LexerATNSimulator, ParserATNSimulator, PredictionContextCache}
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream, Token}
import parsers.java8._

object JavaCodeEncoder extends CodeEncoder {
  def extractTokens(lexer: Java8Lexer): List[TokenModel] = {
    val tokens = new scala.collection.mutable.MutableList[TokenModel]
    val parser = new Java8Parser(new CommonTokenStream(lexer))

    ParseTreeWalker.DEFAULT.walk(new Java8BaseListener() {
      override def enterPackageDeclaration(ctx: Java8Parser.PackageDeclarationContext): Unit = {
        tokens += tokenToModel(ctx.packageName.Identifier.getSymbol, "package")
      }

      override def enterSingleStaticImportDeclaration(ctx: Java8Parser.SingleStaticImportDeclarationContext): Unit = {
        tokens += tokenToModel(ctx.Identifier().getSymbol, "import")
      }

      override def enterNormalClassDeclaration(ctx: Java8Parser.NormalClassDeclarationContext): Unit = {
        tokens += tokenToModel(ctx.Identifier().getSymbol, "class")
      }

      override def enterVariableDeclaratorId(ctx: Java8Parser.VariableDeclaratorIdContext): Unit = {
        tokens += tokenToModel(ctx.Identifier().getSymbol, "variable")
      }

      override def enterMethodDeclarator(ctx: Java8Parser.MethodDeclaratorContext): Unit = {
        tokens += tokenToModel(ctx.Identifier().getSymbol, "method")
      }

      override def enterEnumDeclaration(ctx: Java8Parser.EnumDeclarationContext): Unit = {
        tokens += tokenToModel(ctx.Identifier().getSymbol, "enum")
      }

      override def enterNormalInterfaceDeclaration(ctx: Java8Parser.NormalInterfaceDeclarationContext): Unit = {
        tokens += tokenToModel(ctx.Identifier().getSymbol, "interface")
      }

      override def enterAnnotationTypeElementDeclaration(ctx: Java8Parser.AnnotationTypeElementDeclarationContext): Unit = {
        tokens += tokenToModel(ctx.Identifier().getSymbol, "annotation")
      }

    }, parser.compilationUnit)

    tokens.toList
  }

  override def parse(content: String): List[TokenModel] = {
    val lexer = new Java8Lexer(new ANTLRInputStream(content))
    extractTokens(lexer)
  }

}
