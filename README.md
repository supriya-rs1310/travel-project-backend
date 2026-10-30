# Travel Management System Project Backend

This is the Spring Boot backend for the Travel Project.

## Prerequisites
- Java 17
- MySQL 8

## How to Setup the Database
1. Create a MySQL database named `travel_x_db`.
2. Run the seed file to populate the data:
   `mysql -u root -p travel_x_db < seeds/seed.sql`

## How to Run the Backend
1. Open the project in your IDE (IntelliJ or Eclipse).
2. Let Maven download the dependencies.
3. Run the `TravelProjectApplication.java` file.
4. The backend will start on `http://localhost:8080`.
