<!--Author: W3layouts
   Author URL: http://w3layouts.com
   License: Creative Commons Attribution 3.0 Unported
   License URL: http://creativecommons.org/licenses/by/3.0/
   -->
<!DOCTYPE HTML>
<html lang="zxx">
<head>
<title>Feedback Form</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8" />
<meta name="keywords"
	content="Rating Website Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link rel="stylesheet" href="Feedback/css/style.css" type="text/css"
	media="all" />
<!-- Style-CSS -->
<!-- Font-Awesome-Icons-CSS -->
<!-- //css files -->
<!-- web-fonts -->
<link href="//fonts.googleapis.com/css?family=Roboto:400,500,700"
	rel="stylesheet">
<!-- //web-fonts -->
</head>
<body>
	<!-- title -->
	<h1 class="header-w3ls">Rating/Feedback Form</h1>
	<!-- //title -->
	<!-- content -->
	<div class="porduct-order-agile">
		<form action="blood.controller.UserFeedback" method="post">
			<div class="main">
				<div class="form-group-w3l">
					<p>Name</p>
					<input type="text" name="name" placeholder="" required="">
				</div>
				<div class="form-group-w3l">
					<p>Last Name</p>
					<input type="text" name="lastname" placeholder="" required="">
				</div>
			</div>
			<div class="main">
				<div class="form-group-w3l">
					<p>Phone</p>
					<input type="text" name="phone" placeholder="" required="">
				</div>
				<div class="form-group-w3l">
					<p>Email</p>
					<input type="text" name="email" placeholder="" required="">
				</div>
			</div>
			<div class="sub-hedder">
				<h2>Please rate my Website</h2>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="comments"
						value="option3" checked=""> <label
						class="form-check-label"> Very Bad </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="comments"
						value="option3" checked=""> <label
						class="form-check-label"> Bad </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="comments"
						value="option3" checked=""> <label
						class="form-check-label"> Very Good </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="comments"
						value="option3" checked=""> <label
						class="form-check-label"> Good </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="comments"
						value="option3" checked=""> <label
						class="form-check-label"> Excellent </label>
				</div>
			</div>
			<div class="form-control-w3l">
				<p>Any Message...</p>
				<textarea name="anymessage" placeholder=""></textarea>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	<!-- copyright -->
	<div class="copy">
		<p>
			&copy; 2019 Lifeline . All rights reserved | <i style="color: red;"
				class="fa fa-heart" aria-hidden="true"></i> <a
				href="https://colorlib.com" target="_blank">BloodBank</a> </a>
		</p>
		<a href="http://w3layouts.com"></a>
		</p>
	</div>
	<!-- //copyright -->
</body>
</html>