Create image:
- docker build . --tag=dk-user-api:latest

Run container:
- docker run -p 9200:9200 dk-user-api:latest

Publish to Docker Hub:
- docker tag dk-user-api:V1.0 nikmassv/dk-user-api:latest
- docker push nikmassv/dk-user-api:latest

Run with env varuable:
- docker run --rm -p 8888:9100 --env-file .env --name dk-user-api-env-file dk-user-api:latest
- 