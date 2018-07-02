package datasource

import models._

sealed trait SearchDataSourceError

object SearchDataSourceError {
  final case class OperationFailed(msg: String) extends SearchDataSourceError
}

trait SearchDataSource {
  def initialize: Either[SearchDataSourceError,Unit]
	def getDocumentById(id: String): Either[SearchDataSourceError, String]
  def getDocumentByTerm(query: Map[String,Seq[String]]): Either[SearchDataSourceError, Seq[SearchResultModel]]
  def getAvailableLanguages: Either[SearchDataSourceError, Seq[String]]
  def getAvailableIdentifiers(language: String): Either[SearchDataSourceError, Seq[String]]
  def getAvailableRepositories: Either[SearchDataSourceError, Seq[RepositoryModel]]
  def getChecksumById(id: String): Either[SearchDataSourceError, String]
  def updateChecksumById(id: String, checksum: String): Either[SearchDataSourceError, Unit]
  def indexCode(source: CodeSourceModel): Either[SearchDataSourceError, Unit]
}
