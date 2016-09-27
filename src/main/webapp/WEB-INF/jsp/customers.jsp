<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
	<head>
	    <title>Customers</title>
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	    <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.css">
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.js"></script>
	    
	    <script>
	    
	    $(document).ready( function () {
	    	// Associating the data to the data table.
	   		$('#customersTable').DataTable();
	   		
	    	// Set the dynamic page title.
	   		$('#pageTitle').html("${pageTitle}");
	    	
	   		var table = $('#customersTable').DataTable();
	   	 
	   		// Id starting with pattern
	   		$('[id^=customerRow_]').click( function() {
	   			
	   			// Selected row with the customer to fetch complete customer record.
	   			var customerSelected = ($(this).find(".customerNumber").html());
	            
	   		});
	   		
	   		// Below selects the selected row or cell value.
	   		/*$('#customersTable tbody').on( 'click', 'tr', function () {
	   		    alert( table.row( this ).data() );
	   		} );

	   		$('#customersTable tbody').on( 'click', 'td', function () {
	   		    alert( table.cell( this ).data() );
	   		} );*/
		} );
		
		</script>
	
	</head>
	<body>
	
	<br><br>
		
		<!--  Placeholder for the dynamic page title. -->
		<h1><div id="pageTitle" align="center" style="color: #05BBF7"></div></h1><br>
		
		<!-- Display the customer data. -->
		<table width="80%" align="center" >
			
			<tr>
				<td>
					<table id="customersTable" align="left" class="table table-striped table-hover">
			        	<thead id="customerListTableHeader" style="background-color: #83C8DE;">
			        		<tr>
			        			<th>Customer Number</th>
				        		<th>Customer Name</th>
				        		<th>Customer First Name</th>
				                <th>Customer Last Name</th>
				                <th>Address Line1</th>
				                <th>Address Line2</th>
				        		<th>City</th>
				        		<th>State</th>
				        		<th>Zip</th>
				        		<th>County</th>
				        		<th>Credit Limit</th>
			        		</tr>
			        	</thead>
			        	<tbody>
				            <c:forEach var="customer" items="${customers}" >
				            <tr id="customerRow_${customer.customerNumber}">
				                <td class="customerNumber">${customer.customerNumber}</td>
				                <td>${customer.customerName}</td>
				                <td>${customer.contactFirstName}</td>
				                <td>${customer.contactLastName}</td>
				                <td>${customer.addressLine1}</td>
				                <td>${customer.addressLine2}</td>
				                <td>${customer.city}</td>
				                <td>${customer.state}</td>
				                <td>${customer.postalCode}</td>
				                <td>${customer.country}</td>
				                <td>${customer.creditLimit}</td>
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
