FROM mysql:5.7.21

ADD init.sh /docker-entrypoint-initdb.d/.

WORKDIR /data/init.d
ADD init.d .
ADD my.cnf /etc/mysql/.

EXPOSE 3306