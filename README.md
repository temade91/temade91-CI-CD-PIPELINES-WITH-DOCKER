## Featured Project: Java CI/CD with Gradle & AKS

This project demonstrates a **fully automated CI/CD pipeline** for a Spring Boot application using **GitHub Actions**, **Docker**, and **Azure Kubernetes Service (AKS)**.

### Highlights
- ✅ Automated build, test, containerization, and deployment on code pushes  
- ✅ Built with **Gradle** for build automation and **Docker** for image management with commit-specific tagging  
- ✅ Integrated with **Azure** to deploy seamlessly to AKS with zero-downtime rollouts  
- ✅ Applied **Infrastructure as Code (IaC)** principles using Kubernetes manifests  

### Technologies Used
- Java 17 with Spring Boot  
- Gradle for build automation  
- Docker & Docker Buildx for containerization  
- GitHub Actions for CI/CD automation  
- Azure Kubernetes Service (AKS) for container orchestration  

### Workflow Overview
- **Checkout Code**: Pulls the latest changes from the repository  
- **Build Application**: Compiles and packages the Spring Boot application using Gradle  
- **Docker Build & Push**: Builds the Docker image, tags it, and pushes it to Docker Hub  
- **Azure Login & AKS Context Setup**: Logs in to Azure and sets the Kubernetes context  
- **Deploy to AKS**: Updates the deployment manifest with the new Docker image and applies it to the cluster  

This project showcases expertise in **DevOps, Cloud Automation, CI/CD pipelines, and Azure Cloud Support**.
