package encoder

import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream, Token}
import parsers.golang._

object GolangCodeEncoder extends CodeEncoder {
  def extractTokens(lexer: GolangLexer): Map[String, Set[Token]] = {
    val tokens = new collection.mutable.HashMap[String, collection.mutable.Set[Token]] with collection.mutable.MultiMap[String, Token]
    val parser = new GolangParser(new CommonTokenStream(lexer))

    ParseTreeWalker.DEFAULT.walk(new GolangBaseListener() {
      override def enterImportDecl(ctx: GolangParser.ImportDeclContext): Unit = {
      }

      override def enterTypeSpec(ctx: GolangParser.TypeSpecContext): Unit = {
        tokens.addBinding("type", ctx.IDENTIFIER().getSymbol)
      }

      override def enterFunctionDecl(ctx: GolangParser.FunctionDeclContext): Unit = {
        tokens.addBinding("function",ctx.IDENTIFIER().getSymbol)
      }

      override def enterMethodDecl(ctx: GolangParser.MethodDeclContext): Unit = {
        tokens.addBinding("method", ctx.IDENTIFIER().getSymbol)
      }

      override def enterVarDecl(ctx: GolangParser.VarDeclContext): Unit = {
        ctx.varSpec().forEach((x) => {
          x.identifierList().IDENTIFIER().forEach((i) => {
            tokens.addBinding("variable", i.getSymbol)
          })
        })
      }

      override def enterFieldDecl(ctx: GolangParser.FieldDeclContext) {
        ctx.identifierList().IDENTIFIER().forEach((i) => tokens.addBinding("field", i.getSymbol))
      }

    }, parser.sourceFile())

    tokens.mapValues(_.toSet).toMap[String, Set[Token]]
  }

  override def parse(content: String): Map[String, Set[Token]] = {
    val lexer = new GolangLexer(new ANTLRInputStream(content))
    extractTokens(lexer)
  }

}
