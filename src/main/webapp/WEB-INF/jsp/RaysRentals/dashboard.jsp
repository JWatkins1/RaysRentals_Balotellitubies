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
	type="image/png">
	
	<link rel="stylesheet" type="text/css"
		href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

<title>Dashboard | Rays Rentals</title>
</head>
<body>
	<header> <jsp:directive.include
		file="/WEB-INF/jsp/fragments/nav.jsp" /></header>
	<h2 style="text-align: center;">Dashboard</h2>

	<!--  bikes list table -->
	<div class="row" style="margin-top:20px;">
		<!-- add a bike dash button -->
		<a href="${pageContext.request.contextPath}/smvc/bikes">
		<button class="btn btn-default col-md-3 col-sm-offset-0" type="submit" style="margin-left:70px;">
			<img
				alt="addnewbikeicon"
				src="${pageContext.request.contextPath}/img/addbikeicon.png"
				width="320" height="200">
				<p>Add a new Bike</p>
		</button>
		</a>
		<!-- list of bikes dash button -->
		<a href="${pageContext.request.contextPath}/smvc/bikes/listofbikes">
			<button class="btn btn-default col-md-3 col-md-offset-1" type="submit">
				<img alt="listofbikesicon"
					src="${pageContext.request.contextPath}/img/bicycle.png" width="320"
					height="200">
				<p>List of all Bikes</p>
			</button>
		</a> 
		<!-- rented bikes dash button -->
		<a href="#">
			<button class="btn btn-default col-md-3 col-md-offset-1" type="submit">
				<img alt="rentalbikeicon"
					src="${pageContext.request.contextPath}/img/rental-icon.png"
					height="200">
				<p>Rent a Bike</p>
			</button>
		</a>
	</div>
	
	<div class="row" style="margin-top:20px;">
		<!-- rented bikes list button -->
		<a href=#">
		<button class="btn btn-default col-md-3 col-sm-offset-0" type="submit" style="margin-left:70px;">
			<img
				alt="rentedbikeslisticon"
				src="${pageContext.request.contextPath}/img/list.png"
				width="200" height="200">
				<p>Rented Bikes List</p>
		</button>
		</a>
		<!-- service bikes dash button -->
		<a href="#">
			<button class="btn btn-default col-md-3 col-md-offset-1" type="submit">
				<img alt="service-icon"
					src="${pageContext.request.contextPath}/img/service-icon.png" width="200"
					height="200">
				<p>Servicing Bikes</p>
			</button>
		</a> 
		<!-- rented bikes dash button -->
		<a href="#">
			<button class="btn btn-default col-md-3 col-md-offset-1" type="submit">
				<img alt="disposalicon"
					src="${pageContext.request.contextPath}/img/disposal.png"
					height="200">
				<p>Disposal</p>
			</button>
		</a>
	</div>

	<!--  scripts for jquery and bootstrap js -->
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</body>
</html>