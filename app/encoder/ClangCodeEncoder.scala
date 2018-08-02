package encoder

import fileutils.FileUtils
import models.TokenModel
import scala.sys.process._

object ClangCodeEncoder {
  val clangDumpExec = "tools/bin/clang-dump"

  def parse(content: String, extension: String): List[TokenModel] = {
    val tokens = new collection.mutable.MutableList[TokenModel]
    val f = FileUtils.tmpFile(content, extension)
    val cmd = clangDumpExec :: f.getAbsolutePath :: Nil
    Process(cmd).lineStream.foreach((l) =>
      TokenModel.fromCsv(l) match {
        case Some(token) => tokens += token
        case None        =>
    })
    f.delete()
    tokens.toList
  }
}
