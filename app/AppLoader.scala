import akka.actor.ActorSystem
import akka.dispatch.MessageDispatcher
import components.ElasticsearchComponents
import controllers._
import play.api.ApplicationLoader.Context
import play.api.{Application, ApplicationLoader, BuiltInComponentsFromContext, Logger}
import play.filters.HttpFiltersComponents
import router.Routes
import tasks.RepositoryScannerTask

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
  lazy val repositoryController = new RepositoryController(controllerComponents, documentsRepository)
  lazy val router = new Routes(httpErrorHandler, assets, versionController,searchController, documentController, indexController, repositoryController)

  if(configuration.get[Boolean]("node.crawler")) {
    Logger.info("Starting crawler")
    // Repository scanner uses internal indexer methods and hence we pass it indexer pool
    // TODO: change the crawler to use HTTP api
    val ec: ExecutionContext = actorSystem.dispatchers.lookup("indexer.thread-pool")
    new RepositoryScannerTask(actorSystem, documentsRepository)(ec)
  }

}
