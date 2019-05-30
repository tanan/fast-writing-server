#!/bin/sh

tag=v1.0

docker stop fast-writing-app
docker rm -v fast-writing-app
docker run --network fast-writing-network -d -p 8080:8080 -e MYSQL_ROOT_PASSWORD=secret --name fast-writing-app asia.gcr.io/anan-project/fast-writing-app:${tag}
