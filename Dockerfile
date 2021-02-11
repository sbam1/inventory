FROM openjdk:14
ADD build/libs/inventory-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "inventory-0.0.1-SNAPSHOT.jar"]