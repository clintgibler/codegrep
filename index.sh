#!/bin/bash

codesearch=$PWD
repolist=${REPOLIST:=sources.txt}
sourcedir="/data/sources/github.com"
for i in $(cat $repolist)
do
  echo "Indexing repository: $i" | perl -pe 'use POSIX strftime; print strftime "[%Y-%m-%d %H:%M:%S] ", localtime'
  org=$(echo $i | perl -lan -F'\/' -e 'print $F[3]')
  repo=$(basename $(echo $i | perl -lan -F'\/' -e 'print $F[4]') .git)
  if [[ -d "$sourcedir/$org/$repo" ]];then
    cd $sourcedir/$org/$repo
    java -jar $codesearch/target/codesearch-1.0-SNAPSHOT-jar-with-dependencies.jar $i . >/dev/null
  fi
done
