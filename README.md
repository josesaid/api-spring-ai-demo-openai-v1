# API Spring AI Demo - OpenAI v1

**Project page:** https://josesaid.github.io/api-spring-ai-demo-openai-v1/

REST API built with **Spring Boot** and **Spring AI**, integrated with **OpenAI** models to expose a chat service.

## Requirements

- **JDK 21**
- **Maven** (the project includes the Maven Wrapper, so a local Maven installation is not required)
- An OpenAI **API Key**

## API Key Setup

This project requires an environment variable named `API_KEY` containing your OpenAI key.

1. Generate your API Key at: https://platform.openai.com/settings/organization/api-keys
2. Set the `API_KEY` environment variable with the obtained value:

   **macOS / Linux (terminal):**
   ```bash
   export API_KEY=your_api_key_here
   ```

   **Windows (PowerShell):**
   ```powershell
   $Env:API_KEY = "your_api_key_here"
   ```

   **IntelliJ IDEA:**
   In the run configuration (*Run/Debug Configurations*), add `API_KEY` under *Environment variables*.

## How to Run the Project

Using the Maven Wrapper included in the repository:

```bash
./mvnw spring-boot:run
```

Or if you have Maven installed locally:

```bash
mvn spring-boot:run
```

The application will start on port `8088`.

## Available Endpoint

```
GET http://localhost:8088/api/v1/chat-service/chat?question=your_question
```

Example with `curl`:

```bash
curl "http://localhost:8088/api/v1/chat-service/chat?question=Hello,%20how%20are%20you?"
```

## Author

Created by **Jose Said Olano Garcia**.
