import akka.actor.ActorSystem
import components.ElasticsearchComponents
import controllers._
import play.api.ApplicationLoader.Context
import play.api.{ApplicationLoader, BuiltInComponentsFromContext}
import play.filters.HttpFiltersComponents
import router.Routes
import tasks.{InitializeDataSourceTask, RepositoryScannerTask}

import scala.concurrent.ExecutionContext


class AppLoader extends ApplicationLoader {
  override def load(context: Context) = {
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
  lazy val indexController = new IndexController(controllerComponents, documentsRepository)
  lazy val router = new Routes(httpErrorHandler, assets, versionController,searchController, documentController, indexController)

  initialize()

  private def initialize(): Unit  = {
    new InitializeDataSourceTask(actorSystem, documentsRepository)
    new RepositoryScannerTask(actorSystem, documentsRepository, actorSystem.dispatchers.lookup("contexts.background-index"))
  }

}
