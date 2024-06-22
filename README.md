# Customer

## Overview
This is a simple Customer Management System built using Spring Boot. 
The system provides a RESTful API for managing customer information, 
including adding, retrieving, updating, and deleting customers.

## Project Structure
The project follows a typical Spring Boot structure with 
distinct layers for model, repository, service, and controller.

```
src/main/java/com/hafnium/customer/
├── controller/
│   └── CustomerController.java
├── model/
│   └── Customer.java
├── repository/
│   └── CustomerRepository.java
└── service/
└── CustomerService.java
```
* Model Layer: Represents the data structure.
* Repository Layer: Responsible for data persistence and retrieval.
* Service Layer: Contains business logic.
* Controller Layer: Handles HTTP requests and responses.