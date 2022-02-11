Spring Boot Mongo DB Project

This simple application was developed to demonstrate Spring Boot with MongoDB.
Technologies Used:
    Spring Boot 2.6.3
    Spring Data Jpa
    Lombok
    MongoDB

How to run this application

    1. Change the src/main/resources/application.properties with your MongoDB instance properties.
        It looks like: mongodb+srv://<mongo-db-user>:<mongo-db-password>@<your-cluster>/mongo-db-name
    2. Package JAR using follow command:
            $ mvn clean package spring-boot:repackage
    3. Start the JAR file using java:
            $ java -jar /path_to_jar/goods-accounting-0.1.jar
    4. Use default admin login "admin", password "123"; default user login "user", password "123"