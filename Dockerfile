FROM openjdk:11
ADD target/MyApps-1.0.jar MyApps-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "MyApps-1.0.jar"]

