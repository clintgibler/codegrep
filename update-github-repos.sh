#!/bin/sh

for lang in go java c
do
    tempfoo=`basename $0`
    TMPFILE=`mktemp /tmp/${tempfoo}.XXXXXX` || exit 1
    url="https://api.github.com/search/repositories?q=stars:%3E1000%20language:${lang}&sort=stars&order=desc"
    curl $url | grep clone_url | perl -lan -e '$F[1] =~ s/[",]//g; print $F[1]' > $TMPFILE
    cat $TMPFILE
    REPOLIST=$TMPFILE ./index.sh
done
