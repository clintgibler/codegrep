package tasks

import java.nio.file.Path

import akka.actor.ActorSystem
import com.google.common.base.Charsets
import com.google.common.hash.Hashing
import datasource.SearchDataSource
import fileutils.FileUtils._
import models.CodeSourceModel
import play.api.Logger

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}


class RepositoryScannerTask(actorSystem: ActorSystem, repo: SearchDataSource)(implicit ec: ExecutionContext) {

  def scan(directory: String, repository: String): Unit = {

    def processFile(directory: String, path: Path, repository: String): Unit = {

      def index(checksum: String, id: String, repository: String, filename: String, content: String): Unit = {
        Logger.info("Indexing file at path: %s for repository: %s".format(path.toString, repository))
        repo.indexCode(CodeSourceModel(id, repository, filename, content)) foreach {
          case Left(failure) => Logger.warn(failure.toString)
          case Right(_) =>
            repo.updateChecksumById(id, checksum)
        }
      }

      val content = readFile(path)
      val filename = path.normalize.toString.stripPrefix(directory).stripPrefix("/")
      val id = Hashing.sha256.hashString(repository + "/" + path.toString, Charsets.UTF_8).toString

      content match {
        case Some(s) =>
          val contentChecksum = Hashing.sha256.hashString(s, Charsets.UTF_8).toString
          repo.getChecksumById(id) foreach {
            case Left(failure) =>
              index(contentChecksum, id, repository, filename, s)
            case Right(data) =>
              if (data == contentChecksum)
                Logger.debug("Skipping as no changes for file at path: %s for repository: %s".format(path.toString, repository))
              else index(contentChecksum, id, repository, filename, s)
          }
        case None =>
          Logger.warn("Reading file failed: %s".format(filename))
      }
    }

    Logger.info("Scanning directory: %s for repository: %s".format(directory, repository))
    listFiles(directory) match {
      case Some(files) => files.filter(!_.toString.contains(".git/"))
        .forEach((path) => Future {
          processFile(directory, path, repository)
        })
      case _ =>
    }

  }

  actorSystem.scheduler.schedule(initialDelay = 5.seconds, interval = 5.minutes) {
    repo.getAvailableRepositories foreach {
      case Left(err) => Logger.error("Error retrieving list of repositories: %s".format(err.toString))
      case Right(res) => res.foreach((r) => scan(r.path, r.repository))
    }
  }

}
