package models

case class TokenModel(text: String, line: Int, char: Int, tokenType: String)
object TokenModel {
  def fromCsv(line: String): Option[TokenModel] = {
    val parts = line.split(",")
    if (parts.length != 3) {
      None
    }
    try {
      Some(TokenModel(parts(0), parts(2).toInt, parts(3).toInt, parts(1)))
    } catch {
      case _: java.lang.NumberFormatException => None
      case e: Exception                       => throw e
    }
  }
}
