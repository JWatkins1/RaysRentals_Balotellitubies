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

<title>Register a new Customer | Rays Rentals</title>
</head>
<body>
	<header> <jsp:directive.include
		file="/WEB-INF/jsp/fragments/nav.jsp" /></header>
	<h2 style="text-align: center;">Register a new Customer</h2>
	<form class="form-horizontal" action="newCustomer/saveCustomer" method="POST"
		name="savecustomerform">
		<div class="form-group">
			<label for="Name" class="col-sm-4 control-label formLabel">Name</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="text" class="form-control" name="Name"
					placeholder="Name" id="Name">
			</div>
		</div>
		<div class="form-group">
			<label for="Email" class="col-sm-4 control-label formLabel">Email</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="email" class="form-control" name="Email"
					id="Email" placeholder="Email">
			</div>
		</div>
		<div class="form-group">
			<label for="JoinDate" class="col-sm-4 control-label formLabel">Date Joined</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="date" class="form-control" name="JoinDate"
					id="JoinDate" placeholder="Date Joined">
			</div>
		</div>
		<div class="form-group">
			<label for="Address" class="col-sm-4 control-label formLabel">Address</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="text" class="form-control" name="Address"
					id="Address" placeholder="Address">
			</div>
		</div>
		<div class="form-group">
			<label for="PostCode" class="col-sm-4 control-label formLabel">Post Code</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="text" class="form-control" name="PostCode"
					id="PostCode" placeholder="Post Code">
			</div>
		</div>
		<div class="form-group">
			<label for="PhoneNum" class="col-sm-4 control-label formLabel">Phone Number</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="text" class="form-control" name="PhoneNum"
					id="PhoneNum" placeholder="Phone Number">
			</div>
		</div>

		<div class="form-group">
			<div style="text-align: center;">
				<div class="">
					<button type="submit" class="btn btn-default">Submit
					</button>
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