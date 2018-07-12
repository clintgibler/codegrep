package models

class CodeModel(val id: String,
                val filename: String,
                val repository: String,
                val content: String,
                val language: String,
                val tokens: List[TokenModel]) {
  def json(): String = {
    // index as the language if we know the language - otherwise as text
    import io.circe.syntax._
    import io.circe.{Encoder, Json}

    def tokenToJson(token: TokenModel): Json = {
      Json.obj(("text", Json.fromString(token.text)),
               ("line", Json.fromInt(token.line)),
               ("char", Json.fromInt(token.char)),
               ("type", Json.fromString(token.tokenType)))
    }

    implicit val encodeFoo: Encoder[CodeModel] = new Encoder[CodeModel] {
      final def apply(a: CodeModel): Json =
        Json.obj(
          ("filename", Json.fromString(a.filename)),
          ("content", Json.fromString(a.content)),
          ("repository", Json.fromString(a.repository)),
          ("language", Json.fromString(a.language)),
          ("tokens", Json.arr(a.tokens.map(tokenToJson): _*))
        )
    }

    this.asJson.toString()
  }
}
