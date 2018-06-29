package encoder

import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream, Token}
import parsers.java8._

object JavaCodeEncoder extends CodeEncoder {
  def extractTokens(lexer: Java8Lexer): Map[String, Set[Token]] = {
    val tokens = new collection.mutable.HashMap[String, collection.mutable.Set[Token]] with collection.mutable.MultiMap[String, Token]
    val parser = new Java8Parser(new CommonTokenStream(lexer))

    ParseTreeWalker.DEFAULT.walk(new Java8BaseListener() {
      override def enterPackageDeclaration(ctx: Java8Parser.PackageDeclarationContext): Unit = {
        tokens.addBinding("package", ctx.packageName.Identifier.getSymbol)
      }

      override def enterSingleStaticImportDeclaration(ctx: Java8Parser.SingleStaticImportDeclarationContext): Unit = {
        tokens.addBinding("import", ctx.Identifier().getSymbol)
      }

      override def enterNormalClassDeclaration(ctx: Java8Parser.NormalClassDeclarationContext): Unit = {
        tokens.addBinding("class", ctx.Identifier().getSymbol)
      }

      override def enterVariableDeclaratorId(ctx: Java8Parser.VariableDeclaratorIdContext): Unit = {
        tokens.addBinding("variable", ctx.Identifier().getSymbol)
      }

      override def enterMethodDeclarator(ctx: Java8Parser.MethodDeclaratorContext): Unit = {
        tokens.addBinding("method", ctx.Identifier().getSymbol)
      }

      override def enterEnumDeclaration(ctx: Java8Parser.EnumDeclarationContext): Unit = {
        tokens.addBinding("enum", ctx.Identifier().getSymbol)
      }

      override def enterNormalInterfaceDeclaration(ctx: Java8Parser.NormalInterfaceDeclarationContext): Unit = {
        tokens.addBinding("interface", ctx.Identifier().getSymbol)
      }

      override def enterAnnotationTypeElementDeclaration(ctx: Java8Parser.AnnotationTypeElementDeclarationContext): Unit = {
        tokens.addBinding("annotation", ctx.Identifier().getSymbol)
      }

    }, parser.compilationUnit)

    tokens.mapValues(_.toSet).toMap[String, Set[Token]]
  }

  override def parse(content: String): Map[String, Set[Token]] = {
    val lexer = new Java8Lexer(new ANTLRInputStream(content))
    extractTokens(lexer)
  }

}
