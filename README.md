# Patient Management System (Microservices) – In Progress

This project is a **microservices-based Patient Management System** built using modern backend architecture.  
It is currently in progress and focuses on modular, scalable, event-driven design.

---

## 🚀 Current Status
- Completed: **Patient Service Microservice**
  - CRUD APIs for patient data
  - Layered architecture: Controller → Service → Repository
  - Integrated with **Postgres database**
- Upcoming Modules: Auth, Billing, Analytics, Notification, API Gateway

---

## 🏗️ Tech Stack

- **Backend:** Java, Spring Boot
- **Microservices & Containers:** Docker
- **Database:** Postgres
- **Communication:** REST & gRPC
- **Messaging/Event Streaming:** Kafka
- **Cloud Deployment:** AWS ECS, RDS, MSK
- **Others:** API Gateway, Load Balancers, Localstack for local AWS testing

---

## 📚 What I’m Learning/Implementing

![What Iam learning](images/IMG-20250731-WA0009.jpg)

---

## 🧩 Architecture

### 1. Development Architecture
![Development Architecture](images/development-architecture.png)

### 2. Spring Boot Layered Architecture
![Spring Boot Architecture](images/spring-boot-architecture.png)

### 3. Deployment Architecture
![Deployment Architecture](images/deployment-architecture.png)

---

## ✨ Features (Planned)

- Manage Patients, Doctors, and Appointments
- Authentication & Authorization (JWT / Bearer Tokens)
- Event-driven communication using Kafka
- Real-time communication using REST & gRPC
- API Gateway for routing and load balancing
- Deployment to AWS (ECS, RDS, MSK)

---

## 📂 Current Module

### Patient Service
- **Repository Layer:** Handles DB interactions with Postgres
- **Service Layer:** Business logic and DTO to domain conversions
- **Model Layer:** POJOs for patient entities

---

## 🛠️ How to Run (for Patient Service)

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/patient-management-system.git
   cd patient-management-system/patient-service
