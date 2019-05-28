#!/bin/sh

mysql="mysql --default-character-set=utf8"
mysql_root="${mysql} -uroot -psecret"

${mysql_root} < /data/init.d/init.sql
