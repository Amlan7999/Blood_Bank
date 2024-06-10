<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Verfication</title>
</head>
<body>
	<%
		String emailid = request.getParameter("emailid");
	%>


	<link rel="stylesheet" href="css/bootstrap.css">

	<div class="row-fluid col-xs-12">
		<fieldset>
			<div class="well well-large">
				<center>SMS verification</center>
			</div>

			<div class="control-group form-group">
				<form action="blood.controller.VerifyOTP"
					class="span12 form-horizontal" method="post">

					<label class="control-label col-sm-3">Verification Code</label>
					<div class="controls col-sm-7">

						<input type="hidden" name="emailid" value="<%=emailid%>">
						<input class="form-control " name="otp" type="text">
						<div class="help-block  muted ">Please enter the
							verification code.</div>
						<div>
							<input type="submit" class="btn btn-success" value="Verify"></input>
						</div>
					</div>
			</div>
		</fieldset>
		</form>