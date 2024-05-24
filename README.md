Needs docker installed, aws, localstack cli 

mvn clean verify to build 


to start docker up and running localstack (s3 on 4566):
> docker-compose -f docker-compose-services.yml up -d --build

list local repos:
> aws --endpoint-url=http://localhost:4566 s3 ls

make a bucket:
>aws --endpoint-url=http://localhost:4566 s3 mb s3://mytestbucket

delete:
>aws --endpoint-url=http://localhost:4566 s3 rb s3://mytestbucket

Once docker is running, startup the java project pressing play in the demoapplication  psvm

then using postman hit the endpoints to do the same as above
> http://localhost:8080/create?bucketName=evan
