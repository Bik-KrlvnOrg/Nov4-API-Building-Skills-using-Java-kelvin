FROM openjdk:8-alpine

ADD build/libs/api-0.0.1-SNAPSHOT.jar api-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "api-0.0.1-SNAPSHOT.jar"]
