<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
	<head>
	    <title>Orders</title>
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	    <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.css">
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.js"></script>
	    
	    <script>
	    
	    $(document).ready( function () {
	    	// Associating the data to the data table.
	   		$('#ordersTable').DataTable();

		} );
		
		</script>
	
	</head>
	<body>
	
	<br><br>
		
		<!--  Placeholder for the dynamic page title. -->
		<h1><div id="pageTitle" align="center" style="color: #05BBF7">Orders</div></h1><br>
		
		<!-- Display the customer data. -->
		<table width="80%" align="center" >
			
			<tr>
				<td>
					<table id="ordersTable" align="left" class="table table-striped table-hover">
			        	<thead id="orderListTableHeader" style="background-color: #83C8DE;">
			        		<tr>
			        			<th>Order Number</th>
				        		<th>Order Date</th>
				        		<th>Customer Number</th>
				        		<th>Customer Phone</th>
				        		<th>Shipped Date</th>
				                <th>Status</th>
			        		</tr>
			        	</thead>
			        	<tbody>
				            <c:forEach var="order" items="${orders}" >
				            <tr id="orderRow_${order.orderNumber}">
				                <td class="orderNumber">${order.orderNumber}</td>
				                <td>${order.orderDate}</td>
				                <td>${order.customer.customerNumber}</td>
				                <td>${order.customer.phone}</td>
				                <td>${order.shippedDate}</td>
				                <td>${order.status}</td>
				            </tr>
				            </c:forEach>
			            </tbody>
			       	</table>
				</td>
			</tr>
			
			<tr>
				<td>&nbsp; </td>
			</tr>
			
			<!-- Display information using Bootstrap built in class. -->
			<tr>
				<td class="alert alert-info">
					<i> <b> Note: </b> </i> Please use the 'Search:' filter available on the top right to filter the results. <br>
				</td>
			</tr>
			
		</table>
		<br>
  	</body>
</html>
