# Delivery Application – Notification System

This application simulates the process of sending notifications about delivery requests 
to drivers. When a store gets a product delivery order, the order is processed at the store 
and a delivery request is broadcasted to all the drivers.

This application is designed using the Observer pattern. Since all drivers need to be notified 
about a delivery request, the observer pattern seems most suitable for the notification system. 
The shop with the delivery request is the subject and the drivers are the observers.

Since observer pattern is used, implementation is flexible. The loosely coupled design allows 
for the subject and the observers to not be affected by changes in each other. Therefore, new 
types of drivers can be registered to different shops without requiring more code modification. 
New types of unique drivers can also be added by extending the Driver class. The new drivers can 
then register to receive notifications regarding delivery requests. This design has also reduced 
the amount of duplicated code. Each overridden method is unique to its class.

The Object-oriented design of this application allows the implementation to be simple and easily 
understood. Ex: The shop takes care of a delivery request. But it does not have information about 
the driver doing the delivery. Although each driver type has some attributes in common, their 
differences will be unique to their own class.

Repo: https://github.com/ccelia365?tab=repositories 

# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




