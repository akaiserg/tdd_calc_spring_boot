# TDD calc with spring boot



To run the test:   

<b>gradle test</b>

To run the console app:

Run the class  <b>console.App.java</b>

To run spring boot:

Run the class  <b>application.Application.java</b>

The end points are:

http://localhost:8080/api//add/{val1}/{val2}/

http://localhost:8080/api//subtract/{val1}/{val2}/

http://localhost:8080/api//multiply/{val1}/{val2}/

http://localhost:8080/api//divide/{val1}/{val2}/


To generate  a jar file:

<b>gradle build </b>   

To run  the  server:

<b> java - jar  /build/libs/java -jar calc-rest-service-0.1.0.jar

