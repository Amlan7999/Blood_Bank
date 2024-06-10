<!DOCTYPE html>
<html lang="en">
<head>
<title>User Login</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor1/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts1/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts1/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor1/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor1/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor1/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor1/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor1/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css1/util.css">
<link rel="stylesheet" type="text/css" href="css1/main.css">
<!--===============================================================================================-->
</head>
<body style="background-color: #666666;">
	<%
		String status = request.getParameter("status");
		if (status != null) {
			if (status.equals("0")) {
	%>
	<script type="text/javascript">
		alert('Invalid Emailid or Password');
	</script>

	<%
		}
			if (status.equals("1")) {
	%>
	<script type="text/javascript">
		alert('Password send to email id');
	</script>

	<%
		}
		}
	%>

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form"
					action="blood.controller.UserLogin" method="post">
					<span class="login100-form-title p-b-43"> <h1>BLOOD BANK</h1>
					</span>
					<span class="login100-form-title p-b-43"> Login to continue
					</span>


					<div class="wrap-input100 validate-input"
						data-validate="Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="emailid"> <span
							class="focus-input100"></span> <span class="label-input100">Email</span>
					</div>


					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" name="password"> <span
							class="focus-input100"></span> <span class="label-input100">Password</span>
					</div>

					<div class="flex-sb-m w-full p-t-3 p-b-32">

						<div>
							<a href="userForgotPassword.jsp" class="txt1"> Forgot
								Password? </a>
						</div>
					</div>


					<div class="container-login100-form-btn">
						<button class="login100-form-btn">Login</button>
					</div>

					<div class="text-center p-t-46 p-b-20">
						<span class="txt2"> or sign up using </span>
					</div>

					<div class="login100-form-social flex-c-m">
						<a href="#" class="login100-form-social-item flex-c-m bg1 m-r-5">
							<i class="fa fa-facebook-f" aria-hidden="true"></i>
						</a> <a href="#" class="login100-form-social-item flex-c-m bg2 m-r-5">
							<i class="fa fa-twitter" aria-hidden="true"></i>
						</a>
					</div>
				</form>

				<div class="login100-more"
					style="background-image: url('images/r1.jpg');"></div>
			</div>
		</div>
	</div>





	<!--===============================================================================================-->
	<script src="vendor1/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor1/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor1/bootstrap/js/popper.js"></script>
	<script src="vendor1/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor1/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor1/daterangepicker/moment.min.js"></script>
	<script src="vendor1/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="vendor1/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="js1/main.js"></script>

</body>
</html>