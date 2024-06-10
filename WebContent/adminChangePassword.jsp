<!DOCTYPE html>
<html lang="en">
<head>
<title>Admin Change Password</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor3/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts3/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts3/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor3/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor3/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor3/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor3/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor3/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css3/util.css">
<link rel="stylesheet" type="text/css" href="css3/main.css">
<!--===============================================================================================-->
</head>
<body>

	<div class="limiter">
		<div class="container-login100"
			style="background-image: url('images/bg-01.jpg');">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
				<form class="login100-form validate-form"
					action="blood.controller.AdminChangePassword" method="post">
					<span class="login100-form-title p-b-49"> Change Password </span>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="Username is reauired">
						<span class="label-input100"> Old Password</span> <input
							class="input100" type="password" name="oldpassword"
							placeholder="Type your previous password"> <span
							class="focus-input100" data-symbol="&#xf206;"></span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<span class="label-input100"> New Password</span> <input
							class="input100" type="password" name="newpassword"
							placeholder="Type your new password"> <span
							class="focus-input100" data-symbol="&#xf190;"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="Username is reauired">
						<span class="label-input100"> Confirm Password</span> <input
							class="input100" type="password" name="confirmpassword"
							placeholder="Re-enter the Password"> <span
							class="focus-input100" data-symbol="&#xf206;"></span>
					</div>


					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Reset Password</button>
						</div>
					</div>
				</form>

				<%
					String msg = request.getParameter("msg");
					if (msg != null) {
				%>
				<h5 style="text-align: center; margin-top: 8px; color: red;">
					<%
						out.print(msg);
					%>
				</h5>
				<%
					}
				%>










				<div id="dropDownSelect1"></div>

				<!--===============================================================================================-->
				<script src="vendor3/jquery/jquery-3.2.1.min.js"></script>
				<!--===============================================================================================-->
				<script src="vendor3/animsition/js/animsition.min.js"></script>
				<!--===============================================================================================-->
				<script src="vendor3/bootstrap/js/popper.js"></script>
				<script src="vendor3/bootstrap/js/bootstrap.min.js"></script>
				<!--===============================================================================================-->
				<script src="vendor3/select2/select2.min.js"></script>
				<!--===============================================================================================-->
				<script src="vendor3/daterangepicker/moment.min.js"></script>
				<script src="vendor3/daterangepicker/daterangepicker.js"></script>
				<!--===============================================================================================-->
				<script src="vendor3/countdowntime/countdowntime.js"></script>
				<!--===============================================================================================-->
				<script src="js3/main.js"></script>
</body>
</html>