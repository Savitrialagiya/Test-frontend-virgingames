 # Cucumber-BDD-Automation-Framework
 
Behaviour Driven Development Cucumber - Selenium based automation framework including extent reports with IntelliJ IDE using Java

Tools and Technology:
Selenium , Cucumber, Junit, Page object model with page factory.

Language: 
Java

	This framework contains sample code containing:

•	1 feature (feature file)
•	3 Scenarios
•	Login scenario with valid credentials and for Negative Testing Login scenario with invalid credentials
•	Use this link to get the dependencies - https://mvnrepository.com/

	See configuration in "pom.xml" file

 ![Maven build](https://user-images.githubusercontent.com/114695517/220752257-f6e81ecc-f0b1-41f1-a6e2-83a0fb407a87.png)

Add junit, selenium-java, Webdrivermanager, guava, commons-io dependencies in pom.xml:
 
 ![dep1](https://user-images.githubusercontent.com/114695517/220759782-df372831-b593-44c5-8163-83cb0cd5f38a.png)

Add cucumber-junit, cucumber-java, cucumber-core , org.apache.poi , cucumber-extentsreport dependencies in pom.xml:
 
![dep2](https://user-images.githubusercontent.com/114695517/220760412-db1ee549-d2d5-4bfe-a74e-54a808069b96.png)

Add extentreports, log4j dependencies in pom.xml:

![dep3](https://user-images.githubusercontent.com/114695517/220759860-489f062c-cb6c-4de0-adac-b47282d2d176.png)
 

	Directory structure:

In src there are two packages main and test. main package contains browserfactory, logs,pages,propertyreader,screenshots,utility and test package contains
cucumber and resources package. 

 ![quickstart](https://user-images.githubusercontent.com/114695517/220760845-0606ad2c-bc5b-45f1-9e0c-a241fa0c2102.png)

	Steps to run at your system:

•	Use InteliiJ IDE
•	Clone the repository using "git clone "
•	Run from src/test/java/com/hudl/cucumber/runner/RegressionRunner.java

	How to generate the report

•	To generate report, use this path - target/Extent_Reports/report.html

![report](https://user-images.githubusercontent.com/114695517/220761282-7c9880af-34cc-4e6f-a9e1-d0dbc84ab04b.png)

	Snapshots - Cucumber - Advanced - Report: See here
 
 ![extent report1](https://user-images.githubusercontent.com/114695517/220761384-53d058fd-b211-4095-90a7-5b6cfaa09806.png)






 
 
