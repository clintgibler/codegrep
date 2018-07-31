package encoder

import fileutils.FileUtils
import models.TokenModel
import scala.sys.process._
import play.api.Logger


object ClangCodeEncoder {
  val clangDumpExec = "clang-dump"

  def getToken(line: String) : Option[TokenModel] = {
    val parts = line.split(",")
    if (parts.length != 3) {
      None
    }
    try {
      Some(TokenModel(parts(0), parts(2).toInt, parts(3).toInt, parts(1)))
    } catch {
      case _ :java.lang.NumberFormatException => None
      case e: Exception => throw e
    }
  }

  def parse(content: String, extension: String): List[TokenModel] = {
    val tokens = new collection.mutable.MutableList[TokenModel]
    val f = FileUtils.tmpFile(content, extension)
    val cmd = clangDumpExec :: f.getAbsolutePath :: Nil
    Process(cmd).lineStream.foreach((l) =>
      getToken(l) match {
        case Some(token) => tokens += token
        case None =>
      }
    )
    tokens.toList
  }
}
