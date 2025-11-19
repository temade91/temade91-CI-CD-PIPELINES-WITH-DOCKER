Java CI/CD with Gradle and AKS

This project demonstrates a fully automated CI/CD pipeline for a Spring Boot application using GitHub Actions, Docker, and Azure Kubernetes Service (AKS). The pipeline builds, tests, containerizes, and deploys the application automatically whenever changes are pushed to designated branches.

Key Features

Continuous Integration: Automatically builds the Spring Boot application using Gradle on every push or pull request to master or feature/update branches.

Dockerization: Builds a Docker image of the application and pushes it to Docker Hub with both latest and commit-specific tags.

Azure Integration: Authenticates with Azure, sets the AKS context, and deploys the updated Docker image to your Kubernetes cluster.

Automated Deployment: Updates the Kubernetes deployment manifest with the new Docker image and applies it to AKS, ensuring zero-downtime rollout.

Technologies Used

Java 17 with Spring Boot

Gradle for build automation

Docker & Docker Buildx for containerization

GitHub Actions for CI/CD automation

Azure Kubernetes Service (AKS) for container orchestration

Workflow Overview

Checkout Code: Pulls the latest changes from the repository.

Build Application: Compiles and packages the Spring Boot application using Gradle.

Docker Build & Push: Builds the Docker image, tags it, and pushes it to Docker Hub.

Azure Login & AKS Context Setup: Logs in to Azure and sets the Kubernetes context.

Deploy to AKS: Updates the deployment manifest with the new Docker image and applies it to the cluster.
