<!DOCTYPE html>
<%@page import="blood.model.UsersDao"%>
<%@page import="blood.db.Users"%>
<html>
<head>
	<meta charset="utf-8">
	<title>Edit Profile</title>
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<!-- Font-->
	<link rel="stylesheet" type="text/css" href="css/nunito-font.css">
	<!-- Main Style Css -->
    <link rel="stylesheet" href="Editprofile/css/style.css"/>
</head>
<body class="form-v6">
	<div class="page-content" >
		<div class="form-v6-content" style="width: 600px;">
			<div class="form-left">
			<%
							String emailid = (String)session.getAttribute("emailid");
								Users u = new Users();
								u.setEmailid(emailid);
								u = UsersDao.getDetails(u);
						%>
			<!-- <img src="images/form-v6.jpg" alt="form">-->
			</div>
			<form class="form-detail" action="blood.controller.UserEditProfile" method="post" enctype="multipart/form-data">
				<h2>Edit Profile Form</h2>
				
				<div class="form-row">
				<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Name:</label>	<input type="text"  value="<%=u.getName() %>"name="name" id="full-name" class="input-text" placeholder="Your Name" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Email Id:</label> <input type="text"  value="<%=u.getEmailid() %>" name="emailid" id="your-email" class="input-text" placeholder="Age" required >
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Age:</label> <input type="text" value="<%=u.getAge() %>" name="age" id="your-email" class="input-text" placeholder="Age" required >
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;DOB:</label> <input type="text"  value="<%=u.getDateofbirth() %>"name="dateofbirth" id="password" class="input-text" placeholder="Date Of Birth" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Bloodgroup:</label> <input type="text"  value="<%=u.getBloodgroup() %>"name="bloodgroup" id="comfirm-password" class="input-text" placeholder="Bloodgroup" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Gender:</label> <input type="text" value="<%=u.getGender() %>"name="gender" id="password" class="input-text" placeholder="Gender" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Height:</label> <input type="text"  value="<%=u.getHeight() %>" name="height" id="password" class="input-text" placeholder="Height" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Weight:</label> <input type="text"  value="<%=u.getWeight() %>"name="weight" id="password" class="input-text" placeholder="Weight" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Category:</label> <input type="text" Category: value="<%=u.getCategory() %>" name="category" id="password" class="input-text" placeholder="Category" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Marital Status:</label> <input type="text" Marital Status: value="<%=u.getMaritalstatus() %>" name="maritalstatus" id="password" class="input-text" placeholder="Marital Status" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Past Medical Issues:</label> <input type="text" Past Medical Issuess: value="<%=u.getPastmedicalissues() %>"name="pastmedicalissues" id="password" class="input-text" placeholder="Past Medical Issues" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Last Donation Date:</label> <input type="text" Last Donation Date: value="<%=u.getLastdonationdate() %>"name="lastdonationdate" id="password" class="input-text" placeholder="Last Donation Date" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Contact Number:</label> <input type="text" Contact Number: value="<%=u.getContactnumber() %>"name="contactnumber" id="password" class="input-text" placeholder="Contact Number" required>
				</div>
				<div class="form-row">
					<label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Address:</label> <input type="text" Address: value="<%=u.getAddress() %>" name="address" id="password" class="input-text" placeholder="Address" required>
				</div>
				 <div class="form-group">
                    <label style="color: black;">&nbsp;&nbsp;&nbsp;&nbsp;Photo:</label>  <input type="file" class="form-input" name="photo" id="name" placeholder="Your Photo"/>
                        </div>
				<div class="form-row-last">
					<input type="submit" name="register" class="register" value="Update">
				</div>
			</form>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>