#!/bin/bash

echo '#####################'
echo '### DESAFIO INDRA ###'
echo '#####################'

rm -rf target/*
mvn -Dmaven.test.skip=true install

export JAVA_HOME="C:\dev\java\jdk-11.0.6\bin\java"
export VERSION="0.0.1-SNAPSHOT"
export PROJ_NAME="desafio"

$JAVA_HOME -jar "target/$PROJ_NAME-$VERSION".jar