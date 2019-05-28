#!/bin/sh

tag=5.7.21

docker stop fast-writing-db
docker rm -v fast-writing-db
docker run --network fast-writing-network -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=secret --name fast-writing-db fast-writing-db:${tag}
