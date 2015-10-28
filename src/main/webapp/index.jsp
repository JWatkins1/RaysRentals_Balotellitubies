<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<metacharset"utf-8">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport"
	content="width=device-width, initial-scale=1.0 maximum-scale-1.0 user-scaleable=no">

<link
	href='${pageContext.request.contextPath}http://fonts.googleapis.com/css?family=Lato:400,900'
	rel='stylesheet' type='text/css'>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/main.css}" />

<link rel="icon"
	href="${pageContext.request.contextPath}/img/bicycle.png"
	type="image/png" sizes="16x16">

<title>Log In | Rays Rentals</title>
</head>
<body>
	<header><jsp:directive.include
		file="/WEB-INF/jsp/fragments/nav.jsp" /> </header>
	<h2 style="text-align: center;">Log In</h2>
	<form class="form-horizontal" action="LogInRequest" method="POST" name="login">
		<div class="form-group">
			<!-- <label for="Email" class="col-sm-4 control-label formLabel">Email</label> -->
			<div class="col-md-4 col-md-offset-4">
				<input type="email" class="col-md-4 form-control" name="Email"
					placeholder="Email" id="Email">
			</div>
		</div>
		<div class="form-group">
			<!-- <label for="Password" class="col-sm-4 control-label formLabel">Password</label> -->
			<div class="col-md-4 col-md-offset-4">
				<input type="password" class="form-control" name="Password"
					id="Password" placeholder="Password">
			</div>
		</div>

		<div class="form-group">
			<div style="text-align: center;">
				<div class="">
					<button type="submit" class="btn btn-default">Log In</button>
				</div>
			</div>
		</div>
	</form>

	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css"
		href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
</body>
</html>