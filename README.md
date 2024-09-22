# Photoz Clone

Photoz Clone is a simple Spring Boot application that allows users to upload and download photos, demonstrating basic CRUD (Create, Read, Update, Delete) functionality with file storage. This project serves as a hands-on example of building a RESTful API using Spring Boot, handling file uploads, and managing data persistence.

## Features

- **Photo Upload**: Upload photos using a simple HTML frontend or Postman.
- **Photo Download**: View or download photos using a unique ID.
- **In-Memory Storage**: Stores uploaded photos in memory (via a HashMap).
- **Basic Error Handling**: Returns appropriate HTTP status codes (e.g., 404 for not found).

## Technologies Used

- **Java 11+**: Programming language.
- **Spring Boot**: Framework for building the backend service.
- **H2 Database**: An in-memory database (can be configured for other databases if needed).
- **Maven**: Build and dependency management.
- **HTML & JavaScript**: Basic frontend for photo upload.

## Prerequisites

- **Java 11 or later**: Ensure Java is installed on your machine.
- **Maven**: Make sure Maven is installed and configured.
- **Git**: For cloning the repository.

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/marcobehlerjetbrains/photoz-clone.git
cd photoz-clone
