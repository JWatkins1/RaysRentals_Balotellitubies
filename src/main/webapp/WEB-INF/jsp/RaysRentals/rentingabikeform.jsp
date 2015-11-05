<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
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

<link rel="stylesheet" type="text/css"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/main.css}" />

<link rel="icon"
	href="${pageContext.request.contextPath}/img/bicycle.png"
	type="image/png" sizes="16x16">

<title>Rent a Bike | Rays Rentals</title>
</head>
<body>
	<header><jsp:directive.include
		file="/WEB-INF/jsp/fragments/nav.jsp" /></header>
	<h2 style="text-align: center;">Rent a Bike</h2>
	<form class="form-horizontal" name="rentABikeForm" method="POST"
		action="rental/submitrental">
		<!-- bike dropdown -->
		<div class="form-group">
			<label for="Bike" class="col-sm-4 control-label formLabel">Available
				Bikes</label>
			<div class="col-md-4 col-md-offset-0">
				<select class="form-control" name="Bike" id="Bike">
					<option value="" disabled="" selected="">Select a Bike</option>
					<c:forEach items="${bike}" var="bikes">
						<option value="${bikes.id}">Name: ${bikes.name}, Version:
							${bikes.manufacturerVersion}, Cost of Bike: £${bikes.cost}, Type:
							${bikes.bikeType}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<!-- customer dropdown -->
		<div class="form-group">
			<label for="CustomerId" class="col-sm-4 control-label formLabel">Customers</label>
			<div class="col-md-4 col-md-offset-0">
				<select class="form-control" name="CustomerId" id="CustomerId">
					<option value="" disabled="" selected="">Select a Customer</option>
					<c:forEach items="${customers}" var="customer">
						<option value="${customer.id}">Name: ${customer.name},
							Email: ${customer.email}, Address: ${customer.address}, Phone
							No.: ${customer.phoneNumber}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<!-- rent start date -->
		<div class="form-group">
			<label for="StartDate" class="col-sm-4 control-label formLabel">Start
				Date</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="date" class="form-control" name="StartDate"
					id="StartDate" placeholder="Start Date">
			</div>
		</div>
		<!-- rent end date -->
		<div class="form-group">
			<label for="EndDate" class="col-sm-4 control-label formLabel">End
				Date</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="date" class="form-control" name="EndDate" id="EndDate">
			</div>
		</div>
		<!-- cost of rental -->
		<div class="form-group">
			<label for="CostOfRental" class="col-sm-4 control-label formLabel">Cost
				of Rental</label>
			<div class="col-md-4 col-md-offset-0">
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">£</span>
				<input class="form-control" readonly name="CostOfRental" id ="CostOfRental">
			</div>
			</div>
		</div>
		<!-- cost of rental -->
		<div class="form-group">
			<label for="CustomerPaid" class="col-sm-4 control-label formLabel">Has
				the Customer paid?</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="checkbox" name="CustomerPaid">
			</div>
		</div>
		<!-- submit button -->
		<div class="form-group">
			<div style="text-align: center;">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>

	</form>
	<!--  scripts for jquery and bootstrap js -->
	<script>
		var startDate = document.getElementById('StartDate'), endDate = document
				.getElementById('EndDate'), costOfRental = document
				.getElementById('CostOfRental');

		var trigFunc = function() {
			var diffDays = Math.round(Math.abs(Date.parse(endDate.value)
					- Date.parse(startDate.value)))
					/ 1000 / 60 / 60 / 24;
			/*daily price is 12*/
			var result = diffDays * 12;
			costOfRental.value = !isNaN(result) ? result : 'N/A';
		}

		startDate.onchange = trigFunc;
		endDate.onchange = trigFunc;
	</script>
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</body>
</html>