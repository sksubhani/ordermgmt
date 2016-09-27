# ordermgmt
A Spring MVC, JPA, Hibernate and MySQL Example <br> <br>

This is a sample Order Management application showcasing the use of below mentioned technologies.  <br>

<b> Project Description </b> <br>
We have Customers who places the Orders. An Order an be placed by a Customer. Customer can place multiple orders.
There are more tables in the database which we can use for our demo in later part.

Additional configuration info:
The database with tables and data can be simply downloaded from http://www.mysqltutorial.org/mysql-sample-database.aspx and configure and keep it ready to use.

<table>

 <tr>
  <td> <b> User Interface </b>: </td>
   <td> HTML, Bootstrap, CSS, JQuery, JQuery Plugins - Data Tables, Java Script, JSP (Java Server Pages) </td>
 </tr>

<tr>
<td> <b> Middle Tier (Java / J2EE): </b>  </td>
<td> Java, J2EE, JPA (Java Persistence API),  Spring (Core, Context, MVC, REST),  Hibernate </td>
</tr>

<tr>
<td> <b> Backend (Database) </b>: </td>
<td> HQL / SQL, MySQL </td>
</tr>

<tr>
<td> <b> Logging </b>:  </td>
<td> SLF4J over Log4J </td>
</tr>

<tr>
<td> <b> Testing </b>: </td>
<td> JUnit </td>
</tr>

<tr>
<td> <b> Application / Web Server: </b> </td>
<td> Tomcat8 </td>
</tr>

<tr>
<td>  <b> Source code repository: </b> </td>
<td> Github </td>
</tr>

</table>

<br> 

<b> Sample REST URIs: </b> <br>
Retrieve all Customers: <br>
http://localhost:8080/ordermgmt/customers

Retrieve Customer by Customer Number: <br>
http://localhost:8080/ordermgmt/customers/119

Retrieve all customers within a City: <br>
http://localhost:8080/ordermgmt/customers/cities/Nantes

Retrieve all avaialble Orders: <br>
http://localhost:8080/ordermgmt/orders/all

