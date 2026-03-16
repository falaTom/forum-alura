# ForumHub API - Backend Challenge

API REST desenvolvida para o desafio de conclusão do módulo de Spring Boot da Alura (Oracle Next Education). A aplicação simula o gerenciamento de tópicos de um fórum com persistência de dados e segurança via JWT.

## ⚙️ Stack Técnica
* **Runtime:** Java 17
* **Framework:** Spring Boot 3.x
* **Security:** Spring Security + Auth0 JWT
* **Database:** PostgreSQL
* **Migration:** Flyway
* **Modelagem:** JPA / Hibernate

## 🏗️ Estrutura de Endpoints
* `POST /login` - Autenticação de usuários.
* `GET /topicos` - Listagem de tópicos (requer Token).
* `POST /topicos` - Cadastro de novos tópicos (requer Token).
* `GET /topicos/{id}` - Detalhamento de tópico específico.
* `PUT /topicos/{id}` - Atualização de dados.
* `DELETE /topicos/{id}` - Exclusão lógica/física.

## 🔑 Configuração de Autenticação
A segurança implementada utiliza o fluxo **Stateless**.
1. O usuário envia as credenciais.
2. O servidor valida via `UserDetailsService` e `BCryptPasswordEncoder`.
3. É gerado um Token JWT com expiração de 2 horas.
4. O cliente deve enviar o Token no Header `Authorization: Bearer <token>`.

## 🛠️ Instruções para Deploy Local
1. Clone o repositório.
2. Configure o `application.properties` com as credenciais do PostgreSQL.
3. Certifique-se de que a tabela `usuarios` contém o hash BCrypt correto para teste.
4. Execute via Maven: `./mvnw spring-boot:run` ou pela IDE.

---
**Desenvolvedor:** Éverton Da Silva Brito 
**Status:** Funcionalidades de CRUD concluídas. Camada de Segurança em fase de depuração (Ref.: 403 Forbidden troubleshooting).

