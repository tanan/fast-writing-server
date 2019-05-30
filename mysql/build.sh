#!/bin/sh

tag=5.7.21

docker build --rm -t asia.gcr.io/anan-project/fast-writing-db:${tag} .
