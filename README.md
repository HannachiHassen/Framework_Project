## Developing a Framework and Automating Live Project

##Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
* Developing Software 
     - Download Java JDK 
     - Download Eclipse or IntelliJ IDEA
     - Download Apache Maven

## Built With

* [Java](https://www.oracle.com/java/) - Java JDK
* [Eclipse](https://www.eclipse.org/) - Eclipse IDE
* [Maven](https://maven.apache.org/) - Dependency Management

## Create a Maven Quick-start Project
## Add the dependency tags for below:

* WebDriverManger
* Selenium Java
* TestNG
* Log4j (log4j-api and log4j-core)
* Apache Commons IO
* ExtentReports

## Create a Base class 

* Create resources package under 'src/main/java'
* Create Base class under this package
* Create a method for initializeBrowser inside the Base class 
* Read the browser name from Properties file, instead of hardcoding it
     - Create config.properties file under Config File Folder 
     - Add this property browser=chrome to the file
     - Modify the initializeBrowser code accordingly 
 
## Create a Class for 'LoginTest' under 'src/test/java' under 'testCases' package
 
* Create a method say 'login' and annotate with @Test 
* Extend the LoginTest class with Base class
* Write the code to initialize the browser and open the Application URL
* Run the LoginTest to see, if this is executing so far. 
* Remove the URL hardcoding and read the URL from the properties file 
* Run the LoginTest to see, if this is executing after this change
        - Add this property url= http://tutorialsninja.com/demo/ to the properties file
    
## Write the remaining code of LoginTest by creating Page Objects

* Create a package under 'src/main/java' as 'pageObject'
* Create a class say 'LandingPage' under this package with page objects 
* Create an object for LandingPage from LoginTest and perform required operations 
* Run the LoginTest to see, if this is executing so far.
* Create a class say 'LoginPage' under this package with page objects 
* Create an object for LoginPage from LoginTest and perform required operations 
* Run the LoginTest to see, if this is executing so far.
* Create a class say 'AccountPage' under this package with page objects
* Create an object for AccountPage from LoginTest and perform required operations 
* Run the LoginTest to see, if this is executing so far.
* Remove the email and password hardcoding and read them from the properties file
* Write @AfterMethod to close the browser 

## Parameterize the Test by passing multiple sets of data from DataProvider annotated method

* Create a DataProvider annotated method and pass the data to the Test annotated method 

## Create @BeforeMethod

* Organize the code for opening the Application 

## Create some dummy Test Classes with simple SOP statements

* TestTwo 
* TestThree
* TestFour

## Versioning

For the versions available, see the [tags on this repository](https://github.com/HannachiHassen/project/tags). 

## Authors

* **Hassen Hannachi** - *Initial work* - [HassenHannachi](https://github.com/HannachiHassen)

## License

This project is not under any License - Open source 
 
    