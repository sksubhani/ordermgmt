# ordermgmt
A Spring MVC, JPA, Hibernate and MySQL Example <br> <br>

This is a sample Order Management application showcasing the use of below mentioned technologies.  <br>

<b> Project Description </b> <br>
We have Customers who places the Orders. An Order an be placed by a Customer. Customer can place multiple orders.
There are more tables in the database which we can use for our demo in later part.

Additional configuration info:
The database with tables and data can be simply downloaded from http://www.mysqltutorial.org/mysql-sample-database.aspx and configure and keep it ready to use.


<b> User Interface </b>:  HTML, Bootstrap, CSS, JQuery, JQuery Plugins - Data Tables, Java Script, JSP (Java Server Pages)

<b> Middle Tier (Java / J2EE) </b>:  Java, J2EE, JPA (Java Persistence API),  Spring (Core, Context, MVC, REST),  Hibernate

<b> Backend (Database) </b>: HQL / SQL, MySQL

<b> Logging </b>:  SLF4J over Log4J

<b> Testing </b>: JUnit

<b> Application / Web Server: </b> Tomcat8

<b> Source code repositoryu: </b> Github
<br> <br><br>

<b> Sample REST URIs: </b> <br>
Retrieve all Customers:
http://localhost:8080/ordermgmt/customers

Retrieve Customer by Customer Number:
http://localhost:8080/ordermgmt/customers/119

Retrieve all customers within a City:
http://localhost:8080/ordermgmt/customers/cities/Nantes

Retrieve all avaialble Orders:
http://localhost:8080/ordermgmt/orders/all

