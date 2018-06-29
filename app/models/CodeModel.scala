package models

import org.antlr.v4.runtime.Token


class CodeModel(val id: String, val filename: String, val repository: String, val content: String, val language: String, val tokens: Map[String, Set[Token]]) {
  def json() : String = {
    // index as the language if we know the language - otherwise as text
    import io.circe.syntax._
    import io.circe.{Encoder, Json}

    def tokenToJson(tokenType: String, token: Token): Json = {
      Json.obj(
        ("text", Json.fromString(token.getText)),
        ("line", Json.fromInt(token.getLine)),
        ("char", Json.fromInt(token.getCharPositionInLine)),
        ("type", Json.fromString(tokenType)))
    }

    def tokenMaptoJson(tokensByType: Map[String, Set[Token]]): Json = {
      var b : Set[Json] = Set.empty
      tokensByType.foreach {
        case (tokenType, tokens) => {
          b = b ++ tokens.map((t) => tokenToJson(tokenType,t))
        }
      }
     Json.arr(b.toList:_*)
    }

    implicit val encodeFoo: Encoder[CodeModel] = new Encoder[CodeModel] {
      final def apply(a: CodeModel): Json = Json.obj(
      ("filename", Json.fromString(a.filename)),
      ("content", Json.fromString(a.content)),
      ("repository", Json.fromString(a.repository)),
      ("language", Json.fromString(a.language)),
      ("tokens",  tokenMaptoJson(a.tokens)))
    }

    this.asJson.toString()
  }
}
