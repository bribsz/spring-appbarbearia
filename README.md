# App Barbearia — Spring Boot

API RESTful para gerenciamento de uma barbearia, desenvolvida com **Java 17** e **Spring Boot 3**, incluindo autenticação com **Spring Security**.

## 🚀 Tecnologias

- Java 17
- Spring Boot 3.0.1
- Spring Data JPA
- Spring Security
- Spring Validation
- Spring Web
- Lombok
- MySQL
- H2 (banco em memória para testes)
- Maven

## 📋 Funcionalidades

- Gerenciamento de clientes e agendamentos
- Autenticação e autorização com Spring Security
- Validação de dados de entrada
- Persistência com JPA/Hibernate

## ⚙️ Como rodar o projeto

### Pré-requisitos

- Java 17+
- MySQL rodando localmente

### 1. Clone o repositório

```bash
git clone https://github.com/bribsz/spring-appbarbearia.git
cd spring-appbarbearia
```

### 2. Configure o banco de dados

Crie um banco MySQL e configure o `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/appbarbearia
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

> Para testes, o H2 em memória pode ser usado sem configuração adicional.

### 3. Rode o projeto

```bash
./mvnw spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

## 🔐 Autenticação

O projeto utiliza **Spring Security** para proteção dos endpoints. As rotas protegidas requerem autenticação.
