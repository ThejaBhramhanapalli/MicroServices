FROM openjdk:11
ADD target/user-api-0.0.1-SNAPSHOT.jar user-api.jar
EXPOSE 10000
ENTRYPOINT ["java", "-jar", "user-api.jar"]