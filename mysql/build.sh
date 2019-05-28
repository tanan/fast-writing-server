#!/bin/sh

tag=5.7.21

docker build --rm -t fast-writing-db:${tag} .
