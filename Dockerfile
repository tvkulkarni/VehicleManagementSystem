FROM openjdk:8
EXPOSE 8080
ADD target/Vehicle-Management-System.jar Vehicle-Management-System.jar
ENTRYPOINT ["java","-jar","/Vehicle-Management-System.jar"]