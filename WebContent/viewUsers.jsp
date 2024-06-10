 <!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="blood.model.UsersDao"%>
<%@page import="blood.db.Users"%>
<%@page import="java.util.ArrayList"%>

<html lang="en">
<head>
	<title>View User</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewU/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewU/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewU/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewU/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewU/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="viewU/css/util.css">
	<link rel="stylesheet" type="text/css" href="viewU/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver1">
		<!-- <div class="table100-firstcol"> -->
					<div class="table100-firstcol">
						<table>
							<thead>
								<tr class="row100 head">
									<th class="cell100 column1"><span style="margin-left: 45px;">Photo</span></th>
								</tr>
							</thead>
							<tbody>
								<%
		ArrayList<Users> all = UsersDao.fetchUsers();
		Iterator it = all.iterator();
		while(it.hasNext())
		{
			Users u = (Users)it.next();
			
			%>
		
	
		<tr class="row100 body">
		<%
		
			String photo = u.getPhoto();
		String s1 = "profileimg\\"+photo;
		%>
			<td class="cell100 column1" >
			<%
				if(photo!=null)
				{
			%>
				<img alt="" src="<%=s1 %>" style="height: 150px;width: 120px;margin-left: 30px;">
			<%
				}
				else
				{
					%>
					<img alt="" src="profileimg/user.jpg" style="height: 40px;width: 50px;">
					<%
				}
			%>
								</td>
									</tr>
									<%
									}%>
							</tbody>
						</table>
					</div>
					 <div class="wrap-table100-nextcols js-pscroll">
						<div class="table100-nextcols"> 
							<table>
								<thead>
									<tr class="row100 head">
										
										<th class="cell100 column2">Name</th>
										<th class="cell100 column3">Email ID</th>
										<th class="cell100 column4">Contact No</th>
										<th class="cell100 column5">Generate ID</th>
										<th class="cell100 column6">Delete</th>
									</tr>
								</thead>
								<tbody>
								<%
		 all = UsersDao.fetchUsers();
		 it = all.iterator();
		while(it.hasNext())
		{
			Users u = (Users)it.next();
			
			%>
		
	
		<tr class="row100 body">
		<%
		
			String photo = u.getPhoto();
		String s1 = "profileimg\\"+photo;
		%>
			
			<td class="cell100 column2"><a href="adminUserViewProfile.jsp?emailid=<%=u.getEmailid() %>"><%=u.getName() %></td>
			<td class="cell100 column3"><a href="adminUserViewProfile.jsp?emailid=<%=u.getEmailid() %>"><%=u.getEmailid() %></td>
			<td class="cell100 column4"><a href="adminUserViewProfile.jsp?emailid=<%=u.getEmailid() %>"><%=u.getContactnumber() %></td>
			<td class="cell100 column5"><a href="blood.controller.GenerateId?emailid=<%=u.getEmailid() %>"><button style="cursor: pointer;">Generate</button></a></td>
			<td class="cell100 column6"><a href="blood.controller.DeleteUsers?emailid=<%=u.getEmailid() %>"><img src="images/delete.png" style="height: 150px; width: 100px;" /></a></td>
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
	</div>


<!--===============================================================================================-->	
	<script src="viewU/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="viewU/vendor/bootstrap/js/popper.js"></script>
	<script src="viewU/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="viewU/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="viewU/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script>
		$('.js-pscroll').each(function(){
			var ps = new PerfectScrollbar(this);

			$(window).on('resize', function(){
				ps.update();
			})

			$(this).on('ps-x-reach-start', function(){
				$(this).parent().find('.table100-firstcol').removeClass('shadow-table100-firstcol');
			});

			$(this).on('ps-scroll-x', function(){
				$(this).parent().find('.table100-firstcol').addClass('shadow-table100-firstcol');
			});

		});

		
		
		
	</script>
<!--===============================================================================================-->
	<script src="viewU/js/main.js"></script>

</body>
</html>

