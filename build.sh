#!/bin/sh

pushd ./graphql
./gradlew bootBuildImage
popd

pushd ./mvc
./gradlew bootBuildImage
popd
