### Warning
Actively developed leisurely 

### Idea
codesearch uses ANTLR to tokenize source code files and stores the results in an elasticsearch cluster. This allows us to perform structured searches - for example - in current implementation, you can restrict searches to identifiers. (there by not matching comments etc)

### Development setup

#### Dependencies
1. Oracle JDK 1.8
2. Elasticsearch
3. Golang > 1.5
4. Maven for packaging

#### Install elasticsearch: 
```
Run elasticsearch:
./bin/elasticsearch
```
#### Run http-server (needs golang)
```
cd frontend
go run ./server/http-server.go
```

#### Package indexer (needs maven)
```
mvn package
```

#### Index few files
```
java -jar ./target/codesearch-1.0-SNAPSHOT-jar-with-dependencies.jar https://github.com/syamp/codesearch.git .
```

#### Search 
```
open http://localhost:8080
```

### References

https://github.com/antlr

https://github.com/antlr/grammars-v4
