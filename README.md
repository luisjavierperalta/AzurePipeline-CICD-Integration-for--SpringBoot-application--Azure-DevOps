# Spring Boot Example Project

## Overview

This is a @Spring Boot application designed for building, testing, and deploying using modern DevOps practices. 
This project is integrated with GitHub fVCS and Azure DevOps for CI/CD pipelines.

## Features

- RESTful API with basic CRUD operations
- Integrated with Maven for build management
- CI/CD pipeline set up with Azure DevOps
- Automated deployments to Azure App Service

## Prerequisites

- Java 11 or higher
- Maven
- Git
- An Azure account for deploying the application

## Getting Started

### Clone the Repository

To get started with this project, clone the repository to your local machine:

## bash
git clone https://github.com/luisjavierperalta/AzurePipeline-CICD-Integration-for--SpringBoot-application--Azure-DevOps
cd https://github.com/luisjavierperalta/AzurePipeline-CICD-Integration-for--SpringBoot-application--Azure-DevOps

## Build the project 
mvn clean package

Compiles the source code, runs tests, and packages the app into a @JAR file.

## Run app locally 
mvn spring-boot:run

# Access app API when running 
http://localhost:8080/api

## Deployment
The application is deployed to Azure App Service using the Azure DevOps release pipeline. You need to configure the Azure App Service and set up deployment credentials in Azure DevOps.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any questions or feedback, please contact itsluisjavierperalta@gmail.com





