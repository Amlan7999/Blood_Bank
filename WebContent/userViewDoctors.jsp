<!DOCTYPE html>
<%@page import="blood.db.Doctors"%>
<%@page import="java.util.Iterator"%>
<%@page import="blood.model.DoctorsDao"%>
<%@page import="blood.db.Blood"%>
<%@page import="java.util.ArrayList"%>

<html lang="en">

<head>
<meta charset="UTF-8">
<title>User View Doctors</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">


<link rel="stylesheet" href="viewD/css/style.css">


</head>

<body>

	<section>
		<!--for demo wrap-->
		<h1>View Doctors</h1>
		<div class="tbl-header">
			<table cellpadding="0" cellspacing="0" border="0">
				<thead>
					<tr>
						<th>Photo</th>
						<th>Name</th>
						<th>Contact No.</th>
						<th>Qualification</th>
						<th>Address</th>
					</tr>
					<%
						ArrayList<Doctors> all = DoctorsDao.fetchDoctors();
						Iterator it = all.iterator();
						while (it.hasNext()) {
							Doctors d = (Doctors) it.next();
					%>

					<tr>
					<tr>
						<%
							String photo = d.getPhoto();
								String s1 = "profileimg\\" + photo;
						%>
						<td>
							<%
								if (photo != null) {
							%> <img alt="" src="<%=s1%>" style="height: 150px; width: 120px;">
							<%
								} else {
							%> <img alt="" src="profileimg/user.jpg" style=height:40px;width: 50px;">
							<%
								}
							%>
						</td>
						<td><%=d.getName()%></td>
						<td><%=d.getContactnumber()%></td>
						<td><%=d.getQualification()%></td>
						<td><%=d.getAddress()%></td>
						<td>
					</tr>
					<%
						}
					%>

				</thead>
			</table>
		</div>

	</section>



	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>



	<script src="viewD/js/index.js"></script>




</body>

</html>
