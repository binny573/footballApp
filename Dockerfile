FROM openjdk:8
EXPOSE 8081
ADD target/sb-docker-footballapp.jar sb-docker-footballapp.jar
ENTRYPOINT ["java", "-jar","/sb-docker-footballapp.jar"]