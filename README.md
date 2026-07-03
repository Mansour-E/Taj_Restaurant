# TAJ Restaurant - Food Ordering System

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Kafka](https://img.shields.io/badge/Apache%20Kafka-Event%20Driven-black)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)
![Kubernetes](https://img.shields.io/badge/Kubernetes-Deployed-blue)
![Clean Architecture](https://img.shields.io/badge/Architecture-Clean%20%26%20Hexagonal-purple)

A modern **event-driven microservices** application for a restaurant food ordering system, built with **Clean Architecture**, **Hexagonal Architecture**, **Domain-Driven Design (DDD)**, **SAGA**, **Outbox Pattern**, **CQRS** and **Apache Kafka**.

---

## 🎯 Project Overview

**TAJ Restaurant** is a complete food ordering platform consisting of multiple loosely coupled microservices. The system demonstrates industry best practices for building scalable, maintainable, and resilient microservices architecture.


---

## 🏗 Architecture

### Core Principles Applied:
- **Clean Architecture** + **Hexagonal (Ports & Adapters)**
- **Domain-Driven Design (DDD)** (Aggregates, Domain Events, Bounded Contexts)
- **CQRS** (Command Query Responsibility Segregation)
- **SAGA Pattern** (for distributed transactions)
- **Outbox Pattern** (reliable event publishing)
- **Event-Driven Architecture** with **Apache Kafka**

### Microservices

| Service              | Responsibility                          | Key Patterns               |
|----------------------|-----------------------------------------|----------------------------|
| **Order Service**    | Order creation & management            | Saga Orchestrator, CQRS   |
| **Payment Service**  | Payment processing                     | Outbox, Saga Participant  |
| **Restaurant Service** | Restaurant & menu management         | Outbox, Domain Events     |
| **Customer Service** | Customer information                   | CQRS                      |

---

## 🛠 Technologies & Tools

- **Backend**: Java 21, Spring Boot 3
- **Architecture**: Clean + Hexagonal
- **Messaging**: Apache Kafka + Confluent Schema Registry
- **Database**: PostgreSQL (per service)
- **Persistence**: Spring Data JPA
- **Containerization**: Docker + Docker Compose
- **Orchestration**: Kubernetes (local + Google GKE)
- **Change Data Capture**: Debezium (optional)
- **Build Tool**: Maven

---

## 🚀 How to Run

### Prerequisites
- Docker & Docker Desktop
- Java 21
- Maven
- (Optional) Kubernetes cluster (Minikube or Docker Desktop Kubernetes)

### 1. Local Development

```bash
# Clone the repository
git clone https://github.com/yourusername/taj-restaurant.git
cd taj-restaurant

# Start infrastructure (Kafka, PostgreSQL, etc.)
docker-compose up -d

# Run each service
cd order-service && ./mvnw spring-boot:run
cd payment-service && ./mvnw spring-boot:run
# ... similarly for other services
2. Kubernetes Deployment
Bash# Apply Kubernetes manifests
kubectl apply -f k8s/
3. Full Stack with Helm (Kafka on K8s)
See the deployment/ folder for Helm charts and detailed instructions.

📁 Project Structure (Example - Order Service)
textorder-service/
├── domain/
│   ├── core/           # Domain Entities, Aggregates, Events, Services
│   └── application/    # Use Cases, DTOs, Ports, Input/Output Ports
├── application/        # Adapters (Web, Messaging)
├── dataaccess/         # JPA Repositories & Adapters
├── messaging/          # Kafka Producers & Consumers
└── container/          # Spring Boot Main Class + Configuration

✨ Key Features

Distributed Saga orchestration for order workflow
Reliable event publishing using Outbox Pattern
CQRS implementation (separate read models)
Domain Events & Rich Domain Model
REST APIs with proper validation
Event-driven communication between services
Ready for Cloud deployment (GKE)


📸 Screenshots
(Add screenshots here: Swagger UI, Architecture Diagram, Kafka UI, etc.)

🧪 Testing

Unit Tests (Domain)
Integration Tests
Contract Tests
End-to-End Saga Flow Tests

🤝 Contributing
Feel free to open issues and pull requests. This is a learning project — improvements and discussions are welcome!

📄 License
This project is for educational purposes.

Made with ❤️ and Clean Architecture
Star the project if you found it useful!
