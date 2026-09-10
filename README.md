# 🚀 Automation Exercise - QA Test Automation Framework

A robust and scalable End-to-End (E2E) test automation framework developed in **Java** using **Selenium WebDriver**, designed to validate critical workflows for the practice e-commerce platform [Automation Exercise](https://www.automationexercise.com/).

---

## 🎯 About the Project

The main objective of this project is to automate functional web test cases applying best practices in QA.

### Key Patterns & Principles:
* **Page Object Model (POM):** Clean separation between web page logic (locators and actions) and test scripts located within the `page_objects` package.
* **Component Reusability:** Base classes and generic utilities for browser management and explicit/implicit waits.

---

## 🛠️ Tech Stack

* **Language:** Java
* **Web Automation:** Selenium WebDriver
* **Test Framework:** JUnit
* **Build & Dependency Management:** Maven
* **Design Pattern:** Page Object Model (POM)

---

## 📁 Project Structure

```text
Automation-Excercise/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── page_objects/  # Page Object Model classes
│   │   └── resources/         # Configuration files
│   └── test/
│       └── java/              # Automated test case classes
├── pom.xml                    # Maven configuration and dependencies
└── README.md                  # Project documentation
