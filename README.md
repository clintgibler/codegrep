### Idea
codesearch uses various parsers to tokenize source code files and stores the results in an elasticsearch cluster. This allows us to perform structured searches - for example - in current implementation, you can restrict searches to identifiers. (there by not matching comments etc)

### Development setup

#### Development Dependencies
1. Oracle JDK 1.8
2. Elasticsearch
3. sbt
4. elm
5. clang
6. go

#### Runtime dependencies
1. Elasticsearch
2. Java


#### Install elasticsearch: 
```
Run elasticsearch:
./bin/elasticsearch
```

#### TBD
Instructions to compile clang-dump and golang-dump

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

http://clang.llvm.org/docs/IntroductionToTheClangAST.html

https://golang.org/pkg/go/parser/

https://scalameta.org/scalafmt/

https://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.jdt.doc.isv%2Freference%2Fapi%2Foverview-summary.html
