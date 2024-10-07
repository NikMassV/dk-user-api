Create image:
- docker build . --tag=dk-user-api:V1.0

Run container:
- docker run -p 9200:9200 dk-user-api:V1.0

Publish to Docker Hub:
- docker tag dk-user-api:V1.0 nikmassv/dk-user-api:V1.0
- docker push nikmassv/dk-user-api:V1.0