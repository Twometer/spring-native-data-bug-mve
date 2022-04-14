#!/bin/bash

JARFILE_NAME=demo-0.0.1-SNAPSHOT.jar

if [ "$1" != "--no-build" ]; then
  ./gradlew bootJar
fi

$JAVA_HOME/bin/java -DspringAot=true -agentlib:native-image-agent=config-merge-dir=src/main/resources/META-INF/native-image -jar build/libs/$JARFILE_NAME
