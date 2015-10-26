<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
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

<title>List of Rentals | Rays Rentals</title>
</head>
<body>
	<header><jsp:directive.include
		file="/WEB-INF/jsp/fragments/nav.jsp" /></header>
	<h2 style="text-align: center;">List of Rentals</h2>

	<!--  bikes list table -->
	<div class="container" width="90%">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Bike Name</th>
					<th>Manufacturer Version</th>
					<th>Purchase Date</th>
					<th>Cost of Bike</th>
					<th>Bike Type</th>
					<th>Size</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${rentedBikes}" var="rb">
				<tr>
					<td>${rb.id}</td>
					<td>${rb.name}</td>
					<td>${rb.manufacturerVersion}</td>
					<td>${rb.date}</td>
					<td>£${rb.cost}</td>
					<td>${rb.bikeType}</td>
					<td>${rb.size}</td>
					<td>${rb.status}</td>
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