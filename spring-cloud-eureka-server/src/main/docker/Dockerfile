FROM daocloud.io/library/java:openjdk-8u40
VOLUME /tmp
ADD spring-cloud-eureka-server-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 1001

