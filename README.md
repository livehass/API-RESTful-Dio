# API-RESTful-Dio
Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

##Diagrama de classes

````mermaid

classDiagram
    class User {
        -String name
        -Account account
        -List~Feature~ features
        -Card card
        -List~News~ news
    }

    class Account {
        -String number
        -String agency
        -double balance
        -double limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -String flag
        -String cvv
        -String expiration
    }

    class News {
        -String title
        -String description
    }

    User "1" *-- "1" Account
    User  "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News

````
## Project Description
This project is a RESTful API developed in Java using the Spring Boot framework. The API is configured to use Springdoc OpenAPI to generate endpoint documentation in Swagger UI. The project is managed with Gradle and includes the following main features:  

## Technologies Used
Java: Programming language used for development.
Spring Boot: Framework for building the API.
Springdoc OpenAPI: Library for generating API documentation.
Lombok: Library to reduce boilerplate code.
Gradle: Build automation tool.

## Implemented Features
Home Controller: Provides a welcome message at the root endpoint (/).
User Controller: Implements CRUD operations for user management.
GET /users/{id}: Retrieve a user by ID.
POST /users: Create a new user.
PUT /users/{id}: Update an existing user by ID.
DELETE /users/{id}: Delete a user by ID.
GET /users/all: Retrieve all users.
GET /users/search: Search users by name.
GET /users/exists/{id}: Check if a user exists by ID.

Global Exception Handler: Handles common exceptions and returns appropriate HTTP responses.
OpenAPI Configuration: Customizes the API documentation with title, version, and description.
