### Warning
This is purely a PoC copy pasted from various snippets of code.

### Idea

1. Use ANTLR to parse language files into structured format. Like identifiers, methods, annotations etc. This
is the primary difference - most codesearch projects use regex based parsers and hence can't truly capture
the entire structure.

2. Index the resulting object in Elasticsearch - allowing us to do both text search on content and advanced
analysis like matching on particular type - for example if you want to match method names only etc or if you want to find methods
that are camel case or if you want find number of instances a particular class is used . 

Elasticsearch has extensive query and aggregation capabilities.

3. Finally a simple UI around Elasticsearch

### Development setup

Install elasticsearch: 

add the following two lines to config:
in config/elasticsearch.yml

```
http.cors.enabled: true
http.cors.allow-origin: "*"
```
Run elasticsearch:

./bin/elasticsearch

Run http-server:
```
npm install -g http-server
http-server
```

Now you should be able to see UI at http://localhost:8080/

### Lets index some files (Currently golang/java are supported)

```
mvn package
Specify the folder where you want to parse the files - <path>
java -jar ./target/codesearch-1.0-SNAPSHOT-jar-with-dependencies.jar <path>
```

### References

https://github.com/antlr
https://github.com/antlr/grammars-v4
