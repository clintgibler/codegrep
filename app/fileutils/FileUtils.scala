package fileutils

import java.io.{FileNotFoundException, IOException}
import java.nio.file.{Files, Path, Paths}

import play.api.Logger

object FileUtils {
  def listFiles(directory: String): Option[java.util.stream.Stream[Path]] = {
    try {
      Some(Files.walk(Paths.get(directory)).filter((path) => Files.isRegularFile(path)))
    } catch {
      case e: IOException =>
        Logger.info("Encountered an error while walking the directory: %s".format(directory) + e.printStackTrace())
        None
    }
  }

  def readFile(path: Path): Option[String] = {
    try {
      val bytes = Files.readAllBytes(path)
      Some(new String(bytes, "UTF-8"))
    } catch {
      case e: FileNotFoundException =>
        None
      case e: IOException =>
        None
    }
  }

}
