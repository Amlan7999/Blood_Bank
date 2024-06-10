<!DOCTYPE html>
<%@page import="blood.db.Feedback"%>
<%@page import="blood.db.Users"%>
<%@page import="java.util.Iterator"%>
<%@page import="blood.model.FeedbackDao"%>
<%@page import="blood.db.Blood"%>
<%@page import="java.util.ArrayList"%>
<html lang="en" >

<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>View Feedback</title>
  
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
      <link rel="stylesheet" href="viewF/css/style.css">

  
</head>

<body>

  <div class="table-users">
   <div class="header">View Feedback</div>
   
   <table cellspacing="0">
      <tr>
         <th>Name</th>
         <th>Last Name</th>
         <th>Phone</th>
         <th>Email</th>
         <th>Any Message</th>
      </tr>

	<%

	
		ArrayList<Feedback> all = FeedbackDao.viewFeedback();
		Iterator it = all.iterator();
		while(it.hasNext())
		{
			Feedback f = (Feedback)it.next();
			
			%>
	
		<tr>
			
			<td><%=f.getName() %></td>
			<td><%=f.getLastname() %></td>
			<td><%=f.getPhone() %></td>
			<td><%=f.getEmail() %></td>
			<td><%=f.getAnymessage() %></td>
		</tr>
		<%
		}
		
		%>


         </table>
</div>
  
  

</body>

</html>
