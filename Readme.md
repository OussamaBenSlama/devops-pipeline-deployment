# CI/CD Pipeline for Spring Boot and React Application

This project demonstrates a complete CI/CD pipeline using Docker, GitHub Actions, Terraform, and AWS. It includes frontend and backend containerization, continuous integration, continuous delivery, infrastructure provisioning with Terraform, and final deployment on AWS EC2.

## Table of Contents

- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [CI/CD Pipeline Overview](#cicd-pipeline-overview)
- [1. Configuration](#1-configuration)
- [2. Continuous Integration](#2-continuous-integration)
- [3. Continuous Delivery](#3-continuous-delivery)
- [4. Containerization](#4-containerization)
- [5. Monitoring](#5-monitoring)
- [6. Terraform](#6-terraform)
- [7. Deployment](#7-deployment)
- [Conclusion](#conclusion)

---

## Project Structure

The project is divided into:

- **Frontend**: React application
- **Backend**: Spring Boot application
- **Infrastructure**: Terraform configurations for AWS

## Technologies Used

- Docker & Docker Compose
- GitHub Actions
- Terraform & Terraform Cloud
- AWS EC2
- Prometheus & Grafana (Monitoring)
- Spring Boot & React

## CI/CD Pipeline Overview

The pipeline is divided into three major stages:

1. **Continuous Integration**: Build, test, and push Docker images
2. **Continuous Delivery**: Provision infrastructure using Terraform
3. **Deployment**: Deploy Dockerized applications to AWS EC2

---

## 1. Configuration

- Docker Hub access token created and added to GitHub secrets.
- GitHub secrets include:
  - Terraform Cloud API token
  - Docker Hub credentials
  - GitHub token

## 2. Continuous Integration

Jobs defined in GitHub Actions:

- `frontend-job`: Builds and pushes the frontend Docker image.
- `backend-job`: Builds and pushes the backend Docker image.
- `test-job`: Runs Maven tests.

Each job is triggered on push and pull request events.

## 3. Continuous Delivery

- `terraform-job`: Provisions AWS infrastructure using Terraform Cloud.
- `deploy-job`: Uses Terraform outputs and GitHub Actions to deploy to AWS.

## 4. Containerization

- `docker-compose.dev.yml`: Used to test the frontend and backend locally.
- `docker-compose.prod.yml`: Adds Prometheus and Grafana for monitoring.

## 5. Monitoring

Monitoring stack includes:

- **Prometheus**: Collects metrics from Docker containers.
- **Grafana**: Visualizes application metrics and logs.
- **Loki**: Aggregates and displays container logs.

Dashboards are created for:

- CPU and memory usage
- HTTP request rate
- JVM memory buffer
- Application logs

## 6. Terraform

Terraform is used to define and provision AWS infrastructure, including:

- Creating a project and workspace in Terraform Cloud
- Setting AWS credentials as environment variables
- Generating an API token for GitHub Actions
- Executing the `terraform apply` plan from the CI/CD pipeline

## 7. Deployment

- An EC2 instance is created via Terraform.
- GitHub Actions pushes Docker images to the instance.
- The Docker Compose file runs the containers.
- Final state includes:
  - Spring Boot backend running
  - React frontend served
  - Monitoring services active

---

## Conclusion

This project delivers a fully automated DevOps pipeline using modern technologies. From code commit to deployment on AWS, every step is handled through GitHub Actions, making the process efficient and repeatable. Terraform ensures the infrastructure is versioned and auditable, while Docker guarantees consistency across environments.

Future improvements include scaling to multiple EC2 instances, using a load balancer, and securing secrets with tools like HashiCorp Vault.
