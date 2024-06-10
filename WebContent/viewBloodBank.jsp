<!DOCTYPE html>
<%@page import="blood.model.AdminDao"%>
<%@page import="blood.db.Blood"%>
<%@page import="java.util.Iterator"%>
<%@page import="blood.model.UsersDao"%>
<%@page import="blood.db.Users"%>
<%@page import="java.util.ArrayList"%>


<html lang="en">
<head>
	<title>View Blood Bank</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewBB/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewBB/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewBB/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewBB/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewBB/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewBB/css/util.css">
	<link rel="stylesheet" type="text/css" href="viewBB/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100">
					<table>
						<thead>
							<tr class="table100-head">
								<th class="column1">Bankname</th>
								<th class="column2">Email</th>
								<th class="column3">Address</th>
								<th class="column4">Contact</th>
								<th class="column5" ><span style="margin-right: 20px;">Delete</span></th>
								
							</tr>
						</thead>
						<tbody>
						<%
		ArrayList<Blood> all = AdminDao.fetchBloodBank();
		Iterator it = all.iterator();
		while(it.hasNext())
		{
			Blood b = (Blood)it.next();
			
			%>
		
	
		<tr><td class="column1"><%=b.getBankname() %>
			</td>
			<td class="column2"><%=b.getEmail() %></td>
			<td class="column3"><%=b.getAddress() %></td>
			<td class="column4"><%=b.getContact() %></td>
			<td class="column5"><a href="blood.controller.DeleteBloodBank?emailid=<%=b.getEmail() %>"><img src="images/delete.png" style="height: 40px;width: 40px;margin-right: 20px;" /></a></td>
		</tr>
		<%
		}
	
	%>
															
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>


	

<!--===============================================================================================-->	
	<script src="viewBB/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="viewBB/vendor/bootstrap/js/popper.js"></script>
	<script src="viewBB/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="viewBB/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="viewBB/js/main.js"></script>

</body>
</html>
