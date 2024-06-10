<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Add Camps Form</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- MATERIAL DESIGN ICONIC FONT -->
		<link rel="stylesheet" href="Camps/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">
		
		<!-- STYLE CSS -->
		<link rel="stylesheet" href="Camps/css/style.css">
	</head>

	<body>

		<div class="wrapper">
			<div class="image-holder">
				<img src="Camps/images/wbb.jpg" alt="" >
			</div>
			<div class="form-inner">
				<form action="blood.controller.AddCamps"method=post>
					<div class="form-header">
						<h3>Camps Details</h3>
						<img src="Camps/images/sign-up.png" alt="" class="sign-up-icon">
					</div>
					<div class="form-group">
						<label for="">Name:</label>
						<input type="text" name="name" class="form-control" data-validation="" data-validation-length="3-12">
					</div>
					<div class="form-group">
						<label for="">Address:</label>
						<input type="text" name="address" class="form-control" data-validation="address">
					</div>
					<div class="form-group" >
						<label for="">Date/Timing:</label>
						<input type="text" name="datetiming" class="form-control" data-validation="length" data-validation-length="">
					</div>
					<button>Add</button>
					
				</form>
			</div>
			
		</div>
		
		<script src="Camps/js/jquery-3.3.1.min.js"></script>
		<script src="Camps/js/jquery.form-validator.min.js"></script>
		<script src="Camps/js/main.js"></script>
	</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>