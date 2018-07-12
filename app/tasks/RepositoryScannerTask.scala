package tasks

import java.nio.file.{Files, Path}
import java.util.concurrent.Semaphore

import akka.actor.ActorSystem
import com.google.common.base.Charsets
import com.google.common.hash.Hashing
import datasource.{SearchDataSource, SearchDataSourceError}
import fileutils.FileUtils._
import models.CodeSourceModel
import play.api.Logger

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}

object RepositoryScannerTask {
  // TODO: Get rid of this and use akka streams or something for backpressure, aka to throttle zillion futures
  private val sem = new Semaphore(10)
}

class RepositoryScannerTask(actorSystem: ActorSystem, repo: SearchDataSource)(implicit ec: ExecutionContext) {

  def scan(directory: String, repository: String): Unit = {

    def index(id: String,
              filename: String,
              repository: String,
              content: String): Future[Either[SearchDataSourceError, Unit]] = {
      Logger.debug("Indexing file at path: %s for repository: %s".format(filename.toString, repository))
      repo.indexCode(CodeSourceModel(id = id, repository = repository, filename = filename, content = content))
    }

    def isUpdated(id: String, checksum: String): Future[Either[SearchDataSourceError, Boolean]] = {
      repo.getChecksumById(id = id) map {
        case Left(failure) => Left(failure)
        case Right(data) =>
          if (data == checksum)
            Right(true)
          else
            Right(false)
      }
    }

    def processFileContent(id: String,
                           filename: String,
                           repository: String,
                           content: String,
                           contentChecksum: String): Future[Either[SearchDataSourceError, Unit]] = {

      // TODO: Better expressed as for comprehension I guess
      isUpdated(id, contentChecksum) flatMap { (res) =>
        {
          res match {
            // TODO: Improve this - currently all failures to get status are treated as document not indexed
            case Left(failure) => index(id = id, filename = filename, repository = repository, content = content)
            case Right(data) =>
              if (data) {
                Logger.debug("Skipping filename: %s".format(filename))
                Future(Right(()))
              } else {
                index(id = id, filename = filename, repository = repository, content = content)
              }
          }
        }
      }
    }

    def processFile(directory: String, path: Path, repository: String): Future[Either[String, Unit]] = {
      val content = readFile(path)
      val filename = path.normalize.toString.stripPrefix(directory).stripPrefix("/")
      val id = Hashing.sha256.hashString(repository + "/" + path.toString, Charsets.UTF_8).toString
      content match {
        case Some(s) =>
          val contentChecksum = Hashing.sha256.hashString(s, Charsets.UTF_8).toString
          processFileContent(id, filename, repository = repository, content = s, contentChecksum = contentChecksum) map {
            case Left(failure) => Left("Failed to index: %s %s".format(filename, failure.toString))
            case Right(_) =>
              repo.updateChecksumById(id, contentChecksum)
              Right(())
          }
        case None => Future.successful(Left("Reading file failed: %s".format(filename)))
      }

    }

    Logger.info("Scanning directory: %s for repository: %s".format(directory, repository))
    listFiles(directory) match {
      case Some(files) =>
        files
          .filter(!_.toString.contains(".git/"))
          .filter(Files.size(_) < 1024 * 1024) // Limit to 1MB
          .forEach((path) => {
            RepositoryScannerTask.sem.acquireUninterruptibly()
            Logger.debug(
              "Processing path: %s - Remaining permits: %d".format(path, RepositoryScannerTask.sem.availablePermits()))
            processFile(directory, path, repository) foreach {
              case Left(failure) =>
                Logger.debug(failure)
                RepositoryScannerTask.sem.release()
              case Right(_) =>
                Logger.debug("Finished file: %s".format(path))
                RepositoryScannerTask.sem.release()
            }
          })
      case _ =>
    }

  }

  actorSystem.scheduler.schedule(initialDelay = 5.seconds, interval = 5.minutes) {
    repo.getAvailableRepositories(ec) foreach {
      case Left(err)  => Logger.error("Error retrieving list of repositories: %s".format(err.toString))
      case Right(res) => res.foreach((r) => scan(r.path, r.repository))
    }
  }

}
