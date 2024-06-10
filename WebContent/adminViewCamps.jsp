<!DOCTYPE html>
<%@page import="blood.db.Camps"%>
<%@page import="blood.model.CampsDao"%>
<%@page import="blood.db.Blood"%>
<%@page import="java.util.Iterator"%>
<%@page import="blood.model.UsersDao"%>
<%@page import="blood.db.Users"%>
<%@page import="java.util.ArrayList"%>
<html lang="en" >


<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Admin View Camps</title>
  
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
      <link rel="stylesheet" href="viewC/css/style.css">

  
</head>

<body>

  <div class="table-users">
   <div class="header">View Camps</div>
   
   <table cellspacing="0">
      <tr>
         <th>Name</th>
         <th>Address</th>
         <th>Date/Timing</th>
      </tr>

     
   
  <%
		ArrayList<Camps> all = CampsDao.fetchCamps();
		Iterator it = all.iterator();
		while(it.hasNext())
		{
			Camps c1 = (Camps)it.next();
			
			%>
		
	
		<tr><td><%=c1.getName() %></td>
			<td><%=c1.getAddress() %></td>
			<td> <center><%=c1.getDatetiming() %></center></td>
	
			
		</tr>
		<%
		}
	
	%>
  
</table>
</div>
</body>

</html>

</html>
