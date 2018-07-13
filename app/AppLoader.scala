import java.util.concurrent.{ArrayBlockingQueue, ThreadFactory, ThreadPoolExecutor, TimeUnit}

import akka.actor.ActorSystem
import akka.dispatch.MessageDispatcher
import com.sksamuel.elastic4s.ElasticsearchClientUri
import com.sksamuel.elastic4s.http.HttpClient
import controllers._
import datasource.{SearchDataSource, SearchDataSourceElasticsearch}
import play.api.ApplicationLoader.Context
import play.api.{Application, ApplicationLoader, BuiltInComponentsFromContext, Logger}
import play.filters.HttpFiltersComponents
import router.Routes
import tasks.RepositoryScannerTask
import java.util.concurrent.atomic.AtomicInteger

import scala.concurrent.{ExecutionContext, Future}

class AppLoader extends ApplicationLoader {
  override def load(context: Context): Application = {
    new AppComponents(context).application
  }
}

class AppComponents(context: Context)
    extends BuiltInComponentsFromContext(context)
    with AssetsComponents
    with HttpFiltersComponents {

  implicit val ec: ExecutionContext = actorSystem.dispatchers.defaultGlobalDispatcher

  lazy private val essClient: HttpClient = {
    val essClient = HttpClient(ElasticsearchClientUri("localhost", 9200))
    // Shutdown the client when the app is stopped or reloaded
    applicationLifecycle.addStopHook(() => Future.successful(essClient.close()))
    essClient
  }

  lazy val documentsRepository: SearchDataSource = {
    new SearchDataSourceElasticsearch(essClient)(ec)
  }

  lazy val versionController = new VersionController(controllerComponents)
  lazy val searchController = new SearchController(controllerComponents, documentsRepository)
  lazy val documentController = new DocumentController(controllerComponents, documentsRepository)
  lazy val indexController = new IndexController(controllerComponents, documentsRepository, configuration)
  lazy val repositoryController = new RepositoryController(controllerComponents, documentsRepository)
  lazy val router = new Routes(httpErrorHandler,
                               assets,
                               versionController,
                               searchController,
                               documentController,
                               indexController,
                               repositoryController)

  if (configuration.get[Boolean]("node.crawler")) {
    Logger.info("Starting crawler")
    /*
    // TODO: change the crawler to use HTTP api
    val crawlerThreads = new ThreadPoolExecutor(1,
                                                1,
                                                0L,
                                                TimeUnit.MILLISECONDS,
                                                new ArrayBlockingQueue[Runnable](20),
                                                new ThreadPoolExecutor.AbortPolicy())
    crawlerThreads.setThreadFactory(new ThreadFactory {
      private val counter = new AtomicInteger(0)
      override def newThread(r: Runnable): Thread = {
        val t = new Thread(r)
        t.setDaemon(true)
        t.setName("crawler-thread-%d".format(counter.incrementAndGet()))
        t
      }
    })

    val crawlerEc = ExecutionContext.fromExecutor(crawlerThreads)
    */
    val crawlerEc = actorSystem.dispatchers.lookup("crawler.thread-pool")
    new RepositoryScannerTask(actorSystem, documentsRepository, crawlerEc)(ec)
  }

}
