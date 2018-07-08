### Idea
codesearch uses ANTLR to tokenize source code files and stores the results in an elasticsearch cluster. This allows us to perform structured searches - for example - in current implementation, you can restrict searches to identifiers. (there by not matching comments etc)

### Development setup

#### Dependencies
1. Oracle JDK 1.8
2. Elasticsearch
3. sbt
4. elm

#### Install elasticsearch: 
```
Run elasticsearch:
./bin/elasticsearch
```

#### Play backend
```
sbt run
```
#### Frontend
```
cd frontend-dev
elm-make --output public/dist/bundle.js Main.elm
```

#### Search 
```
open http://localhost:9000
```

### References

https://github.com/antlr

https://github.com/antlr/grammars-v4
