# Sales Order Management API

Backend service for the Sales Order Management System built with Spring Boot.

## Installation Guide

### Prerequisites

- Java 17+
- MySQL 8.0+
- Docker (optional)

### Database Setup

# Using Docker
docker pull mysql:8.0
docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=rootpassword -e MYSQL_DATABASE=salesdb -e MYSQL_USER=salesuser -e MYSQL_PASSWORD=salespassword -p 3306:3306 -d mysql:8.0
Running the Application

Clone the repository:


git clone https://github.com/yourusername/sales-management.git
cd sales-management/backend

Configure database connection (if needed):
Edit src/main/resources/application.properties
Build and run:

./mvnw spring-boot:run
The API will be available at http://localhost:8080
