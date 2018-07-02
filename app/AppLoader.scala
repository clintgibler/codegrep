import akka.actor.ActorSystem
import components.ElasticsearchComponents
import controllers._
import play.api.ApplicationLoader.Context
import play.api.{Application, ApplicationLoader, BuiltInComponentsFromContext, Logger}
import play.filters.HttpFiltersComponents
import router.Routes
import tasks.{InitializeDataSourceTask, RepositoryScannerTask}

import scala.concurrent.ExecutionContext


class AppLoader extends ApplicationLoader {
  override def load(context: Context): Application = {
    new AppComponents(context).application
  }
}


class AppComponents(context: Context)
  extends BuiltInComponentsFromContext(context)
  with ElasticsearchComponents
  with AssetsComponents
  with HttpFiltersComponents {

  lazy val versionController = new VersionController(controllerComponents)
  lazy val searchController = new SearchController(controllerComponents, documentsRepository)
  lazy val documentController = new DocumentController(controllerComponents, documentsRepository)
  lazy val indexController = new IndexController(controllerComponents, documentsRepository, configuration)
  lazy val router = new Routes(httpErrorHandler, assets, versionController,searchController, documentController, indexController)

  if(configuration.get[Boolean]("node.crawler")) {
    Logger.info("Starting crawler")
    new RepositoryScannerTask(actorSystem, documentsRepository, actorSystem.dispatchers.lookup("crawler.thread-pool"))
  }

}
