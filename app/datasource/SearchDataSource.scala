package datasource

import models._

import scala.concurrent.{ExecutionContext, Future}

sealed trait SearchDataSourceError

object SearchDataSourceError {

  final case class OperationFailed(msg: String) extends SearchDataSourceError

}

trait SearchDataSource {
  def getAvailableLanguages: Either[SearchDataSourceError, Seq[String]]

  def getAvailableIdentifiers(language: String): Either[SearchDataSourceError, Seq[String]]

  def getAvailableRepositories: Future[Either[SearchDataSourceError, Seq[RepositoryModel]]]

  def getChecksumById(id: String): Future[Either[SearchDataSourceError, String]]

  def getDocumentById(id: String): Future[Either[SearchDataSourceError, String]]

  def getDocumentByTerm(query: Map[String, Seq[String]]): Future[Either[SearchDataSourceError, Seq[SearchResultModel]]]

  def updateChecksumById(id: String, checksum: String): Future[Either[SearchDataSourceError, Unit]]

  def indexCode(source: CodeSourceModel): Future[Either[SearchDataSourceError, Unit]]
}
