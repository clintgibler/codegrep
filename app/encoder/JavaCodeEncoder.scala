package encoder

import models.TokenModel
import org.eclipse.jdt.core.dom._

object JavaCodeEncoder {

  def parse(content: String): List[TokenModel] = {
    val tokens = new collection.mutable.MutableList[TokenModel]
    val parser = ASTParser.newParser(AST.JLS10)
    parser.setSource(content.toCharArray)
    parser.setKind(ASTParser.K_COMPILATION_UNIT)
    val cu: CompilationUnit = parser.createAST(null).asInstanceOf[CompilationUnit]

    def toTokenModel(node: SimpleName, tokenType: String): TokenModel = {
      TokenModel(
        text = node.getIdentifier,
        line = cu.getLineNumber(node.getStartPosition),
        char = cu.getColumnNumber(node.getStartPosition) + 1,
        tokenType = tokenType
      )
    }

    cu.accept(new ASTVisitor() {
      override def visit(node: MethodDeclaration): Boolean = {
        tokens += toTokenModel(node.getName, "method")
        true
      }
      override def visit(node: VariableDeclarationFragment): Boolean = {
        tokens += toTokenModel(node.getName, "variable")
        true
      }
      override def visit(node: TypeDeclaration): Boolean = {
        if (node.isInterface) {
          tokens += toTokenModel(node.getName, "interface")
        } else {
          tokens += toTokenModel(node.getName, "class")
        }
        true
      }

    })
    tokens.toList
  }
}
