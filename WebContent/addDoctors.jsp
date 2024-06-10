<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Add doctors form</title>
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<!-- Font-->
	<link rel="stylesheet" type="text/css" href="Doctors/css/nunito-font.css">
	<!-- Main Style Css -->
    <link rel="stylesheet" href="Doctors/css/style.css"/>
</head>
<body class="form-v9">
	<div class="page-content">
		<div class="form-v9-content" style="background-image: url('Doctors/images/form-v9.jpg')">
			<form class="form-detail" action="blood.controller.AddDoctors" method="post" enctype="multipart/form-data">
				<h2>Doctor details</h2>
				<div class="form-row-total">
					<div class="form-row">
						<input type="text" name="name" id="full-name" class="input-text" placeholder="Name" required>
					</div>
					<div class="form-row">
						<input type="text" name="emailid" id="your-email" class="input-text" placeholder="Your Email" required>
					</div>
				</div>
				<div class="form-row-total">
					<div class="form-row">
						<input type="text" name="contactnumber" id="contactnumber" class="input-text" placeholder="Contact Number" required>
					</div>
					<div class="form-row">
						<input type="text" name="qualification" id="qualification" class="input-text" placeholder="Qualification" required>
					</div>
				</div>
				<div class="form-row-total">
					<div class="form-row">
						<input type="text" name="age" id="age" class="input-text" placeholder="Age" required>
					</div>
					<div class="form-row">
						<input type="text" name="gender" id="gender" class="input-text" placeholder="Gender" required >
					</div>
				</div>
				<div class="form-row-total">
					<div class="form-row">
						<input type="text" name="address" id="address" class="input-text" placeholder="Address" required>
					</div>
					<div class="form-row">
						Photo :<input type="file" name="photo" id="photo" class="input-text" placeholder="Photo" required >
					</div>
				</div>
				<div class="form-row-last">
					<input style="width:100px;" type="submit" name="add" class="add" value="Add">
				</div>
			</form>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>