<!DOCTYPE html>
<%@page import="blood.db.Camps"%>
<%@page import="blood.model.CampsDao"%>
<%@page import="blood.db.Blood"%>
<%@page import="java.util.Iterator"%>
<%@page import="blood.model.UsersDao"%>
<%@page import="blood.db.Users"%>
<%@page import="java.util.ArrayList"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>View Camps</title>



<link rel="stylesheet" href="view/style.css">


</head>

<body>

	<table class="container">
		<thead>
			<tr>
				<th><h1>Name</h1></th>
				<th><h1>Address</h1></th>
				<th><h1>Date/timing</h1></th>
				<th><h1>Delete</h1></th>
			</tr>
		</thead>
		<tbody>
			<%
				ArrayList<Camps> all = CampsDao.fetchCamps();
				Iterator it = all.iterator();
				while (it.hasNext()) {
					Camps c1 = (Camps) it.next();
			%>


			<tr>
				<td><h1><%=c1.getName()%></h1></td>
				<td><h1><%=c1.getAddress()%></h1></td>
				<td><h1><%=c1.getDatetiming()%></h1></td>

				<td><h1>
						<a
							href="blood.controller.DeleteCamps?datetiming=<%=c1.getDatetiming()%>"><img
							src="images/delete.png" style="height: 80px; width: 60px;" /></a>
					</h1></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>



</body>