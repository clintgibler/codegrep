package components

import com.sksamuel.elastic4s.ElasticsearchClientUri
import com.sksamuel.elastic4s.http.HttpClient
import play.api.inject.ApplicationLifecycle
import play.api.{Configuration, Environment, Mode}
import datasource.{SearchDataSource, SearchDataSourceElasticsearch}

import scala.concurrent.{ExecutionContext, Future}

trait ElasticsearchComponents {

  def environment: Environment

  def configuration: Configuration

  def applicationLifecycle: ApplicationLifecycle

  lazy private val essClient: HttpClient = {

    val essClient = HttpClient(ElasticsearchClientUri("localhost", 9200))
    // Shutdown the client when the app is stopped or reloaded
    applicationLifecycle.addStopHook(() => Future.successful(essClient.close()))
    essClient
  }

  lazy val documentsRepository: SearchDataSource = {
    new SearchDataSourceElasticsearch(essClient)
  }
}
