curl -XPUT localhost:9200/codesearch -d '
{
  "mappings": {
    "code": {
      "properties": {
        "repository": {
          "type":  "string",
          "index": "not_analyzed" 
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
           "text": {"type": "string"},
           "type": {"type": "string"},
           "line": {"type": "integer"},
           "char": {"type": "integer"}
         }
       }
      }
    }
  }
}'
