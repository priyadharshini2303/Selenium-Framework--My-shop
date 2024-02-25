Hybrid Test Automation Framework Based on:

-Selenium Webdriver

-TestNG

-Maven

-Extent Report

For Patterns:

-Page Object Model (POM) is to separate the page logic from the test logic , promoting code reusability, maintainability, and readability. Instead of initializing elements using annotations like @FindBy, as done in the Page Factory approach, the "By type" approach directly uses Selenium's By class to define element locators.

- Factory Pattern is used in initializing the webdriver for different browsers based on a specified browser type.

🛠️ Key Components:

Testing with TestNG: Data-driven testing is made easy with TestNG, utilizing an external data supplier for dynamic test scenarios. The testng.xml file orchestrates tests efficiently.

Listener: In our testng.xml configuration file, I've specified the listener class to be invoked during test execution, and capturing responding to various events such as test start, success and failure.

Extent reporting: After the test finishes, a visual report is generated for all the executed test cases. In case of any failure test, a screenshot of the active browser is captured. 
