curl -XDELETE localhost:9200/codesearch
curl -XPUT localhost:9200/codesearch -d '
{
  "mappings": {
    "code": {
      "properties": {
        "repository": {
          "type":  "string",
          "fields": {
            "raw": {
               "type": "keyword"
            }
          }
        },
        "language": {
          "type": "string",
          "index": "not_analyzed"
       },
        "filename": {
          "type": "string",
          "index": "not_analyzed"
       },
       "tokens": {
         "type": "nested",
         "properties": {
           "text": {"type": "string", "index": "not_analyzed"},
           "type": {"type": "string", "index": "not_analyzed"},
           "line": {"type": "integer"},
           "char": {"type": "integer"}
         }
       }
      }
    }
  }
}'

curl -XDELETE localhost:9200/status 
curl -XPUT localhost:9200/status -d '
{
  "mappings": {
    "status": {
      "properties": {
        "checksum": {
          "type": "string",
          "index": "not_analyzed"
       }
      }
    }
  }
}'
