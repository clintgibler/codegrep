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

      override def enterVariableDeclarator(ctx: Java8Parser.VariableDeclaratorContext): Unit = {
        tokens.addBinding("variable", ctx.variableDeclaratorId().Identifier().getSymbol)
      }

    }, parser.compilationUnit)

    tokens.mapValues(_.toSet).toMap[String, Set[Token]]
  }

  override def parse(content: String): Map[String, Set[Token]] = {
    val lexer = new Java8Lexer(new ANTLRInputStream(content))
    extractTokens(lexer)
  }

}
