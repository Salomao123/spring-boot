mvn clean install

export DBHOSTNAME=us-cdbr-east-04.cleardb.com
export DBUSERNAME=b0e68f61ff3ca2
export DBPASSWORD=58106ec6
export DBSCHEMA=heroku_97ba000e2a41f14

docker build -t salomaocode/petshop .

docker push salomaocode/petshop

docker-compose -f docker-compose.yml up -d
