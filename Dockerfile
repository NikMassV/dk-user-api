## Build stage
FROM gradle:jdk21-jammy AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon --stacktrace

## Package stage
FROM openjdk:21-jdk-slim

ENV port=9200

RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/dk-user-api-1.0.0.jar
ENTRYPOINT ["java","-jar","/app/dk-user-api-1.0.0.jar"]