# Hotel Reservation API

A hotel reservation web API built with **Spring Boot** and **MySQL**. The API allows users to manage hotel reservations, including checking room availability, booking rooms, modifying, and canceling reservations. It provides secure endpoints and is containerized using **Docker**.

## Features

- Manage hotel reservations
- Check room availability
- Book, modify, and cancel reservations
- User authentication with **Spring Security**
- API documentation via **Swagger** at [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## Technologies Used

- **Spring Boot 3.4.2**
- **Spring Security**
- **Spring Data JPA** (MySQL)
- **MySQL 8.0.33**
- **Docker**
- **Lombok**

## Prerequisites

- **JDK 21+** (for running the application)
- **Maven 3+** (for building the project without Docker)
- **Docker** (if using Docker)

## Installation

### With Docker

1. Clone the repository:
   ```bash
   git clone https://github.com/francotaype/hotelBackend.git
   cd hotelBacked

2.  Create the .env file in the root of the project with the following environment variables:
    ```bash
    DB_USER_NAME=root
    DB_PASSWORD=1234
    MYSQL_ROOT_PASSWORD=1234
    MYSQL_PASSWORD=1234
    SECURITY_USER_NAME=admin
    SECURITY_USER_PASSWORD=adminpassword

    JWT_SECRET=9dhjfsd78sdf8d7f9sdf9dsf8ds7f9sdf98sd7f9ds8f7d8f7sd9f8sd7f9d8fs7d89f7sd8f7ds89fsd8f7ds8f7dsf9d
    JWT_EXPIRATION_MS=86400000


3. Build and start the containers with Docker Compose:

        docker-compose build 
        docker-compose up 

  Access the API at http://localhost:8080.

  Access the API documentation via Swagger at http://localhost:8080/swagger-ui/index.html.

### Without Docker

  1. Clone the repository:

    git clone https://github.com/francotaype/hotelBackend.git
    cd hotelBacked


2. Configure your MySQL database:


3. Update application.properties with your connection details (located in src/main/resources/application.properties):

        spring.datasource.url=jdbc:mysql://localhost:3306/hotel_database?createDatabaseIfNotExist=true&serverTimezone=UTC
        spring.datasource.username=root
        spring.datasource.password=root
        spring.security.user.name=admin
        spring.security.user.password=adminpassword
        JWT_SECRET=9dhjfsd78sdf8d7f9sdf9dsf8ds7f9sdf98sd7f9ds8f7d8f7sd9f8sd7f9d8fs7d89f7sd8f7ds89fsd8f7ds8f7dsf9d
        JWT_EXPIRATION_MS=86400000


5. Run the application:

        mvn clean package -DskipTests
    
        mvn spring-boot:run

    Access the API at http://localhost:8080.

    Access the API documentation via Swagger at http://localhost:8080/swagger-ui/index.html.

## Made by
Made by Franco Taype
