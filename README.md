# Java Backend Learning Journey
<p align="center">
  <img src="docs/assets/java-backend-readme-banner.gif"
       alt="Java Backend Learning Journey"
       width="900">
</p>

[![Maven CI](https://github.com/himanshuParashar0101/java-backend-learning-journey/actions/workflows/maven-ci.yml/badge.svg)](https://github.com/himanshuParashar0101/java-backend-learning-journey/actions/workflows/maven-ci.yml)

A structured learning repository documenting my progression from **Java fundamentals** to **professional backend engineering** with Java, Maven, Spring Boot, databases, testing, and production-oriented development practices.

## Current Focus

**Java conditional statements**

- `if`
- `if-else`
- `else-if`
- nested conditions
- `switch`

## Learning Progress

### Java Fundamentals

- [x] Java development environment setup
- [x] First Java program
- [x] Variables and data types
- [x] Arithmetic operators
- [ ] Conditional statements
- [ ] Loops
- [ ] Methods
- [ ] Arrays
- [ ] Strings
- [ ] User input

### Core Java

- [ ] Object-oriented programming
- [ ] Collections and generics
- [ ] Exception handling
- [ ] File handling
- [ ] Streams and functional programming
- [ ] Multithreading and concurrency
- [ ] JVM fundamentals
- [ ] Unit testing

### Backend Development

- [ ] SQL
- [ ] JDBC
- [ ] Spring Framework
- [ ] Spring Boot
- [ ] REST API development
- [ ] Spring Data JPA
- [ ] Hibernate
- [ ] Validation
- [ ] Spring Security
- [ ] Docker
- [ ] CI/CD
- [ ] Microservices
- [ ] System design

## Repository Structure

```text
java-backend-learning-journey/
├── .github/
│   └── workflows/
│       └── maven-ci.yml
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── himanshu/
│   │   │           └── javajourney/
│   │   │               ├── fundamentals/
│   │   │               │   ├── setup/
│   │   │               │   ├── introduction/
│   │   │               │   ├── variables/
│   │   │               │   ├── operators/
│   │   │               │   │   ├── basics/
│   │   │               │   │   └── problems/
│   │   │               │   └── conditionals/
│   │   │               │       ├── basics/
│   │   │               │       └── problems/
│   │   │               └── sandbox/
│   │   └── resources/
│   └── test/
│       ├── java/
│       └── resources/
├── .gitattributes
├── .gitignore
├── LEARNING_LOG.md
├── ROADMAP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Development Workflow

Every learning topic follows an industry-style Git and GitHub workflow:

1. Create a GitHub issue
2. Create a short-lived working branch
3. Make focused commits
4. Push the branch to GitHub
5. Open a pull request
6. Review the changed files
7. Run automated Maven checks
8. Merge into `main`
9. Delete the completed branch

### Branch Naming Examples

```text
learn/2-conditionals
learn/3-loops
feature/10-add-user-registration
fix/15-handle-invalid-input
docs/20-update-roadmap
chore/1-repository-foundation
```

### Commit Message Examples

```text
feat(conditionals): add basic if statement example
test(conditionals): add eligibility checker tests
docs: update Java learning roadmap
build: add Maven Wrapper for reproducible builds
ci: verify project using Maven Wrapper
```

## Build and Verification

This project uses the **Maven Wrapper**, so a separate global Maven installation is not required.

### Windows

```powershell
.\mvnw.cmd clean verify
```

### Linux and macOS

```bash
./mvnw clean verify
```

A successful build ends with:

```text
BUILD SUCCESS
```

## Continuous Integration

GitHub Actions automatically runs the Maven verification workflow when:

- A pull request targets `main`
- Changes are pushed to `main`
- The workflow is started manually from the Actions tab

Workflow file:

```text
.github/workflows/maven-ci.yml
```

## Documentation

- [Java Backend Roadmap](ROADMAP.md)
- [Learning Log](LEARNING_LOG.md)

## Engineering Principles

This repository follows these practices:

- Standard Maven project structure
- Clear package and class naming
- Short-lived branches
- Pull-request-based development
- Focused commit history
- Automated build verification
- Generated files excluded through `.gitignore`
- Reproducible builds through Maven Wrapper
- Consistent line endings through `.gitattributes`

## Technology Stack

- Java 25
- Maven
- IntelliJ IDEA
- Git
- GitHub
- GitHub Actions

## Repository

[github.com/himanshuParashar0101/java-backend-learning-journey](https://github.com/himanshuParashar0101/java-backend-learning-journey)

## Author

**Himanshu Parashar**

Learning Java and backend engineering through structured practice, documentation, testing, and professional Git workflows.