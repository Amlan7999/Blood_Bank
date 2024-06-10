<!DOCTYPE html>
<%@page import="blood.db.Contact"%>
<%@page import="blood.db.Users"%>
<%@page import="java.util.Iterator"%>
<%@page import="blood.model.ContactDao"%>
<%@page import="blood.db.Blood"%>
<%@page import="java.util.ArrayList"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>View Contact</title>



<link rel="stylesheet" href="view/style.css">


</head>

<body>


	<table class="container">
		<thead>
			<tr>

				<th><h1 style="color: white;">Name</h1></th>
				<th><h1 style="color: white;">Email</h1></th>
				<th><h1 style="color: white;">Phone</h1></th>
				<th><h1 style="color: white;">Message</h1></th>
			</tr>
		</thead>
		<tbody>
			<%
				ArrayList<Contact> all = ContactDao.viewContact();
				Iterator it = all.iterator();
				while (it.hasNext()) {
					Contact c = (Contact) it.next();
			%>

			<tr>

				<td><%=c.getName()%></td>
				<td><%=c.getEmail()%></td>
				<td><%=c.getPhone()%></td>
				<td><%=c.getMessage()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>



</body>

</html>
