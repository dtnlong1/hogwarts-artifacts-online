# Hogwarts Artifacts Online - Spring Boot Application 

[![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/Washingtonwei/hogwarts-artifacts-online/maven-build.yml?logo=apachemaven&label=Maven%20Build)](https://github.com/Washingtonwei/hogwarts-artifacts-online/actions/workflows/maven-build.yml) [![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/Washingtonwei/hogwarts-artifacts-online/azure-webapps-deploy.yml?logo=microsoftazure&label=Azure%20Deployment)](https://github.com/Washingtonwei/hogwarts-artifacts-online/actions/workflows/azure-webapps-deploy.yml) ![Dynamic XML Badge](https://img.shields.io/badge/dynamic/xml?url=https%3A%2F%2Fraw.githubusercontent.com%2FWashingtonwei%2Fhogwarts-artifacts-online%2Fmain%2Fpom.xml&query=%2F*%5Blocal-name()%3D'project'%5D%2F*%5Blocal-name()%3D'properties'%5D%2F*%5Blocal-name()%3D'java.version'%5D&label=Java) ![Dynamic XML Badge](https://img.shields.io/badge/dynamic/xml?url=https%3A%2F%2Fraw.githubusercontent.com%2FWashingtonwei%2Fhogwarts-artifacts-online%2Fmain%2Fpom.xml&query=%2F*%5Blocal-name()%3D'project'%5D%2F*%5Blocal-name()%3D'parent'%5D%2F*%5Blocal-name()%3D'version'%5D&label=Spring%20Boot) ![Dynamic XML Badge](https://img.shields.io/badge/dynamic/xml?url=https%3A%2F%2Fraw.githubusercontent.com%2FWashingtonwei%2Fhogwarts-artifacts-online%2Fmain%2Fpom.xml&query=%2F*%5Blocal-name()%3D'project'%5D%2F*%5Blocal-name()%3D'properties'%5D%2F*%5Blocal-name()%3D'spring-cloud-azure.version'%5D&label=Spring%20Cloud%20Azure)

## What is 🧙‍♂️ Hogwarts Artifacts Online 🧙‍♀️?

*Hogwarts Artifacts Online* is a sample back-end application designed to demonstrate typical use cases and best practices in Spring Boot development.

In addition to exploring the features of Spring Boot, this project helps me learn essential software engineering practices:
- Crafting REST APIs and applying object-oriented design principles.
- Embracing test-driven development.
- Setting up a comprehensive CI/CD pipeline, ensuring smooth deployment of the application.

## What have I Learned?

- **Dependency Injection** and the use of Spring Framework's core container.
- Building the web layer with **Spring MVC (Model-View-Controller)**.
- Data persistence in relational databases using **Spring Data JPA (Jakarta Persistence API)**.
- User authentication and authorization with **Spring Security** and **JWT (JSON Web Tokens)**.
- Deploying a Spring Boot application to a cloud platform with **Spring Cloud Azure**.
- Monitoring a running Spring Boot application in the production with **Spring Boot Actuator**.
- Making requests to OpenAI API with **RestClient**.

Additionally, I learned good software engineering practices, such as:

- Defining software requirements with **User Stories**.
- Version control and project planning using **Git and GitHub**.
- The **API-First Approach** in designing effective REST APIs.
- **Test-Driven Development (TDD)**: writing tests first, then coding to pass the tests, and refactoring.
- **Object-Oriented Design** with UML.
- **CI/CD (Continuous Integration and Continuous Delivery)** with GitHub Actions.


## Run Hogwarts Artifacts Online Locally

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/dtnlong1/hogwarts-artifacts-online.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd hogwarts-artifacts-online
   ```

3. **Run the application:**

Since *Hogwarts Artifacts Online* is a Spring Boot application built using Maven, you can  run it from Maven directly using the Spring Boot Maven plugin:

   ```bash
   ./mvnw spring-boot:run
   ```

Or on Windows:

   ```bash
   .\mvnw.cmd spring-boot:run
   ```

## Building a Container

There is a `Dockerfile` in this project. You can build a container image (if you have a docker daemon):

```bash
docker build .
```


## Acknowledgements
- Inspired and by Professor Bingyang Wei's Spring Boot tutorial.
