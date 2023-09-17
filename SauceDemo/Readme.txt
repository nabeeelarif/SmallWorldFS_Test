Requirements:
Make sure Allure commanline is installed on the system. Path must be set on environment variable.
No need to install Web Driver. Web Driver Manager is used to take care of it.

Instructions:
src/test/java contains test, helper classes, pages, and step definitions.
src/test/resources contains Feature files.
List of automated tests:
  -Login (positive and negative) - to be found in Runner/TestRunner_Login;
  -Filter Product - to be found in Runner/TestRunner_FilterProduct; and
  -Add product to cart - to be found in Runner/TestRunner_AddProductToCart.
In order to execute tests, simply right click on "Runner" folder and Run as "JUnit Test".
After the tests are executed, reports will be generated in "allure-results" folder. 
Note: If you are unable to find this folder, refresh the project and it will be there. 
To view these reports, open command prompt by right clicking on the project -> Show in -> Terminal, and execute the command "allure serve".

I hope you guys like the work 🙂
