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
