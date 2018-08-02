package encoder

import fileutils.FileUtils
import models.TokenModel
import scala.sys.process.Process

object GolangCodeEncoder {
    val golangDumpExec = "tools/bin/golang-dump"
    def parse(content: String, extension: String): List[TokenModel] = {
      val tokens = new collection.mutable.MutableList[TokenModel]
      val f = FileUtils.tmpFile(content, extension)
      val cmd = golangDumpExec :: f.getAbsolutePath :: Nil
      Process(cmd).lineStream.foreach((l) =>
        TokenModel.fromCsv(l) match {
          case Some(token) => tokens += token
          case None =>
        }
      )
      f.delete()
      tokens.toList
    }
}
