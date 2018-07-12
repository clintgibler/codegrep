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

  def getAvailableRepositories(
      implicit ec: ExecutionContext): Future[Either[SearchDataSourceError, Seq[RepositoryModel]]]

  def getChecksumById(id: String)(implicit ec: ExecutionContext): Future[Either[SearchDataSourceError, String]]

  def getDocumentById(id: String)(implicit ec: ExecutionContext): Future[Either[SearchDataSourceError, String]]

  def getDocumentByTerm(query: Map[String, Seq[String]])(
      implicit ec: ExecutionContext): Future[Either[SearchDataSourceError, Seq[SearchResultModel]]]

  def updateChecksumById(id: String, checksum: String)(
      implicit ec: ExecutionContext): Future[Either[SearchDataSourceError, Unit]]

  def indexCode(source: CodeSourceModel)(implicit ec: ExecutionContext): Future[Either[SearchDataSourceError, Unit]]
}
