# 🏨 AirbnbApp

A hotel booking backend application built with **Spring Boot**, **Java**, **Spring Data JPA**, and **PostgreSQL** that provides RESTful APIs for managing hotels, rooms, users, guests, bookings, and payments.

### 📌 Project Overview

AirbnbApp is a backend application designed to provide core functionality for a hotel booking platform. The application follows a layered architecture with **Controllers, Services, Repositories, DTOs, and Entities**.
It supports different user roles, including **Guests** and **Hotel Managers**, and uses **Spring Data JPA** for database persistence.

### ✨ Features

🏨 Hotel management<br>
🛏️ Room management<br>
👤 User management<br>
🎭 Role-based functionality for Guests and Hotel Managers<br>
📅 Booking management<br>
💳 Payment status management<br>
📦 Room inventory management<br>
🔄 DTO-based data transfer<br>
⚡ RESTful APIs using Spring Boot<br>
🗄️ PostgreSQL database integration<br>
❌ Custom exception handling<br>

---

## 🛠 Tech Stack

### Backend

* Java 21
* Spring Boot
* RESTful APIs
* Spring Data JPA
* Maven

### Database

* PostgreSQL
* SQL

### Libraries & Tools

* ModelMapper
* Lombok
* IntelliJ IDEA
* DBeaver
* Git & GitHub

---

## 📂 Project Structure

```text
AirbnbApp
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── spring
│   │   │           └── project
│   │   │               └── AirbnbApp
│   │   │                   ├── config
│   │   │                   ├── controller
│   │   │                   ├── dto
│   │   │                   ├── entity
│   │   │                   ├── enums
│   │   │                   ├── exception
│   │   │                   ├── repository
│   │   │                   ├── service
│   │   │                   └── AirbnbAppApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
├── README.md
└── .gitignore
```

---

### Controller

Handles incoming HTTP requests and exposes RESTful API endpoints.

### Service

Contains the application's business logic.

### Repository

Uses **Spring Data JPA** to communicate with the PostgreSQL database.

### Entity

Represents the application's persistent data model.

### DTO

Used to transfer data between the API and application layers without directly exposing entity objects.

---

## 🗃️ Main Entities

The application contains the following major entities:

* `User`
* `Guest`
* `Hotel`
* `Room`
* `Booking`
* `Payment`
* `Inventory`
* `HotelContactInfo`

### Enums

* `Role`
* `Gender`
* `BookingStatus`
* `PaymentStatus`

---

## 🚀 REST API Endpoints

### Create a Hotel

```http
POST /hotels
```

### Get Hotel by ID

```http
GET /hotels/{hotelId}
```

### Example

```http
GET /hotels/1
```

The API returns hotel information using a `HotelDto`.

---

## 📄 Example API Response

```json
{
  "id": 1,
  "name": "Grand Palace Hotel",
  "city": "Noida"
}
```

---

## ⚙️ Installation

### 1. Clone the Repository

```bash
git clone https://github.com/iamkapilchauhan/AirbnbApp.git
```

### 2. Open the Project

Open the project using **IntelliJ IDEA** or your preferred Java IDE.

### 3. Configure PostgreSQL

Create a PostgreSQL database and configure the database connection in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/Airbnb
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### 4. Run the Application

Run:

```text
AirbnbAppApplication.java
```

Or using Maven:

```bash
mvnw.cmd spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

## 🔮 Future Enhancements

🔐 Spring Security & JWT authentication<br>
🏠 Complete hotel manager dashboard<br>
🔎 Hotel search and filtering<br>
📅 Room availability checking<br>
💳 Payment gateway integration<br>
⭐ Hotel reviews and ratings<br>
📧 Email notifications<br>
📍 Location-based hotel search<br>
🖼️ Hotel image upload<br>
☁️ Cloud deployment<br>

---

## 👨‍💻 Author

**Kapil Chauhan**

🌐 GitHub: https://github.com/iamkapilchauhan

💼 LinkedIn: https://www.linkedin.com/in/iamkapilchauhan/

---

## 🙏 Acknowledgements

* Spring Boot for backend development.
* Spring Data JPA for database persistence.
* PostgreSQL for database management.
* ModelMapper for DTO and entity mapping.
