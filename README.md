# saucedemo
UI Automation with Playwright and java

# Playwright Test Framework

This project is a test automation framework for the website [Sauce Demo](https://www.saucedemo.com/) using Playwright, Java, and TestNG. The framework covers various test cases such as login, add to cart, remove from cart, and checkout functionality.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java JDK (version 11 or higher)
- Maven (version 3.6.3 or higher)
- Git

## Project Structure

saucedemo-project/
│
├── src/
│ └── main/
│ └── java/
│ └── com/
│ └── example/
│ └── tests/
│ ├── BaseTest.java
│ ├── LoginTest.java
│ ├── CartTest.java
│ └── CheckoutTest.java
├── pom.xml
└── testng.xml


## Setup

## **Clone the repository:**
```sh
git clone https://github.com/merugu-nakesh/saucedemo.git
cd saucedemo
```
## Install dependencies:
Ensure that all dependencies are installed by running:
```sh
mvn clean install
```    
## Install Playwright browsers:
Playwright requires certain browsers to be installed. You can install them using:
```sh
mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
```
## Test Cases Review
Go to following src/main/resources/sauceDemoTestcases.html download and open this file in a browser to view the testcases

## Running Tests
You can run the tests using the following Maven command:
```sh
mvn clean test
```
The tests are configured to run using TestNG, as defined in the testng.xml file.

## View Test Reports
You can view your test suite execution for playwright in the following directory in file

```sh
target/surefire-reports/index.html
```


