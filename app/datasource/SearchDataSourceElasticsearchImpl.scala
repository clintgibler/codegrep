package datasource

import com.sksamuel.elastic4s.http.HttpClient
import models.SearchResultModel

class SearchDataSourceElasticsearchImpl(client: HttpClient) extends SearchDataSourceElasticsearch(client, "codesearch"){
}
