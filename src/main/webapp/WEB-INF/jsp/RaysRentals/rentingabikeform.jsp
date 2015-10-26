<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

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

<title>List of Bike | Rays Rentals</title>
</head>
<body>
	<header><jsp:directive.include
		file="/WEB-INF/jsp/fragments/nav.jsp" /></header>
	<h2 style="text-align: center;">Rent a Bike</h2>
	<form class="form-horizontal" name="">
		<div class="form-group">
			<label for="bikeId" class="col-sm-4 control-label formLabel">Select
				a Bike</label>
			<div class="col-md-4 col-md-offset-0">
			<c:forEach items="availableBike" var="avB" varStatus="avBikes">
				<select>
					<option>${avB.id}</option>
				</select>
			</c:forEach>	
			</div>
		</div>
	</form>
	<!--  bikes list table -->
	<div class="container" width="90%">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Bike Name</th>
					<th>Manufacturer Version</th>
					<th>Purchase Date</th>
					<th>Cost of Bike(£)</th>
					<th>Bike Type</th>
					<th>Size</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${bike}" var="bl">
					<tr>
						<td>${bl.id}</td>
						<td>${bl.name}</td>
						<td>${bl.manufacturerVersion}</td>
						<td>${bl.date}</td>
						<td>${bl.cost}</td>
						<td>${bl.bikeType}</td>
						<td>${bl.size}</td>
						<td>${bl.status}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!-- table end -->

	<!--  scripts for jquery and bootstrap js -->
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css"
		href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
</body>
</html>