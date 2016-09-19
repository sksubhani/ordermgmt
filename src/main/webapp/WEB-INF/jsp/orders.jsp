<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dv57454
  Date: 9/18/2016
  Time: 6:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
Hello world!

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">Order Details </h3>
    </div>
    <div class="panel-body">
        <table class="table">
            <c:forEach var="order" items="${orders}">


            <tr>
                <td>Order Number : ${order.orderNumber} <br>
                </td>
                <td>Order Date : ${order.orderDate}</td>
            </tr>
            </c:forEach>
    </div>

</div>
</div>


</body>
</html>
