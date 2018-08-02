package encoder

import models.TokenModel
import play.api.Logger
import scala.meta._

object ScalaCodeEncoder {

  def parse(content: String): List[TokenModel] = {
    val tokens = new collection.mutable.MutableList[TokenModel]
    try {
      content.parse[Source].get.traverse {
        case v: Defn.Class =>
          tokens += TokenModel(v.name.value, v.pos.startLine, v.pos.startColumn, "class")
        case v: Defn.Object =>
          tokens += TokenModel(v.name.value, v.pos.startLine, v.pos.startColumn, "object")
        case v: Defn.Trait =>
          tokens += TokenModel(v.name.value, v.pos.startLine, v.pos.startColumn, "trait")
        case v: Defn.Val =>
          v.tokens
            .filter(_.productPrefix == "Ident")
            .foreach((t) => tokens += TokenModel(t.text, t.pos.startLine, t.pos.startColumn, "variable"))
        case v: Defn.Var =>
          v.tokens
            .filter(_.productPrefix == "Ident")
            .foreach((t) => tokens += TokenModel(t.text, t.pos.startLine, t.pos.startColumn, "variable"))
        case v: Defn.Def =>
          tokens += TokenModel(v.name.toString(), v.name.pos.startLine, v.name.pos.startColumn, "function")
      }
    } catch {
      case e: StackOverflowError =>
        Logger.warn("Encountered stack overflow: %s".format(e.getMessage))
    }
    tokens.toList
  }

}
