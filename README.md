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
    2. Build docker-image using follow command:
            $ docker build -t <your_name> .
    3. Find your image: 
            $ docker images
    4. Run image using command and image_id:
            $ docker run -p <your_port>:8080 <image_id>
    5. First check "localhost:8080/signIn" (default login for admin: 'admin', password '123', for user: 'user', password '123')
    6. Then for "admin-role" check the "localhost:8080/admin/items"
    7. For "user-role" check the "localhost:8080/items"
