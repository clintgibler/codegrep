#!/bin/bash

codesearch=$PWD
repolist=${REPOLIST:=sources.txt}
for i in $(cat $repolist)
do
  tempfoo=$(basename $(basename $i) .git)
  TMPDIR=`mktemp -d /tmp/${tempfoo}.XXXXXX` || exit 1
  cd $TMPDIR || exit 1
  git clone --depth 1 $i
  cd $tempfoo || exit 1
  java -jar $codesearch/target/codesearch-1.0-SNAPSHOT-jar-with-dependencies.jar $i .
  rm -rf $TMPDIR
done
