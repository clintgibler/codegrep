package encoder

import models.TokenModel
import play.api.Logger
import scala.meta._

object ScalaCodeEncoder extends CodeEncoder {

  override def parse(content: String): List[TokenModel] = {
    var l: List[TokenModel] = List.empty
    content.parse[Source].get.traverse {
      case v: Defn.Class =>
        l ::= TokenModel(v.name.value, v.pos.startLine, v.pos.startColumn, "class")
      case v: Defn.Object =>
        l ::= TokenModel(v.name.value, v.pos.startLine, v.pos.startColumn, "object")
      case v: Defn.Trait =>
        l ::= TokenModel(v.name.value, v.pos.startLine, v.pos.startColumn, "trait")
      case v: Defn.Val =>
        v.tokens
          .filter(_.productPrefix == "Ident")
          .foreach((t) => l ::= TokenModel(t.text, t.pos.startLine, t.pos.startColumn, "variable"))
      case v: Defn.Var =>
        v.tokens
          .filter(_.productPrefix == "Ident")
          .foreach((t) => l ::= TokenModel(t.text, t.pos.startLine, t.pos.startColumn, "variable"))
      case v: Defn.Def =>
        v.tokens
          .filter(_.productPrefix == "Ident")
          .foreach((t) => l ::= TokenModel(t.text, t.pos.startLine, t.pos.startColumn, "function"))

    }
    l
  }

}
