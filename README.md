# 🚀 Trabalho Web - API Backend (Spring Boot)

API REST desenvolvida com Java e Spring Boot para gerenciamento de publicações.

O projeto segue arquitetura em camadas, aplicando boas práticas de organização, separação de responsabilidades e integração com banco de dados.

---

## 🧠 Arquitetura

O projeto está estruturado em camadas:

- **Controller** → Responsável pelos endpoints e requisições HTTP  
- **Service** → Regras de negócio  
- **Repository** → Acesso ao banco de dados  
- **DTO / Model** → Estrutura de dados da aplicação  

Estrutura principal:
src/main/java/com.blogsenac
│
├── controller
├── service
├── repository
├── dto
└── TrabalhoWebApplication

---

## 🛠️ Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- Banco de dados (configure no application.properties)

---

## 📌 Funcionalidades

- Criar publicação
- Listar publicações
- Atualizar publicação
- Remover publicação
- Tratamento básico de exceções
- Estrutura organizada em camadas

---

## ⚙️ Como Executar o Projeto

### 1️⃣ Clonar o repositório
git clone https://github.com/SEU_USUARIO/backend-trabalho-web.git

### 2️⃣ Acessar a pasta do projeto
cd backend-trabalho-web

### 3️⃣ Executar com Maven
Se estiver usando o wrapper:
./mvnw spring-boot:run

No Windows:
mvnw.cmd spring-boot:run

Ou pela IDE (IntelliJ / VSCode) executando a classe:
TrabalhoWebApplication.java

🔗 Endpoints
Exemplo base:
POST    /publicacoes
GET     /publicacoes
PUT     /publicacoes/{id}
DELETE  /publicacoes/{id}

🗄️ Configuração do Banco de Dados
Configure o arquivo:
src/main/resources/application.properties
Exemplo:
spring.datasource.url=jdbc:mysql://localhost:3306/seubanco
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update

📌 Objetivo do Projeto
Projeto acadêmico com foco em:
Estruturação de API REST
Organização em camadas
Aplicação de conceitos de backend
Integração com banco de dados
Boas práticas com Spring Boot
