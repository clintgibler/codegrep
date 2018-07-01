package tasks

import akka.actor.ActorSystem
import play.api.ApplicationLoader.Context
import play.api.Logger
import datasource.SearchDataSource

import scala.concurrent.ExecutionContext
import scala.concurrent.duration._

class InitializeDataSourceTask(actorSystem: ActorSystem, repo: SearchDataSource)(implicit executionContext: ExecutionContext) {
  actorSystem.scheduler.schedule(initialDelay = 1.second, interval = 1.minute) {
    repo.initialize match {
      case Left(err) => Logger.error("Error initializing data source: %s".format(err.toString))
      case Right(_) =>
    }
  }
}
