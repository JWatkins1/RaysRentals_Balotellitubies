<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<link rel="stylesheet" type="text/css"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

<link rel="icon"
	href="${pageContext.request.contextPath}/img/bicycle.png"
	type="image/png" sizes="16x16">

<title>Add a new Bike | Rays Rentals</title>
</head>
<body>
	<header><jsp:directive.include
		file="/WEB-INF/jsp/fragments/nav.jsp" /></header>
	<h2 style="text-align: center;">Add a new Bike</h2>
	<form class="form-horizontal" action="bikes/addabike" method="POST"
		name="addabikeform">
		<div class="form-group">
			<label for="BikeName" class="col-sm-4 control-label formLabel">Bike
				Name</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="text" class="form-control" name="BikeName"
					placeholder="Bike Name" id="BikeName">
			</div>
		</div>
		<div class="form-group">
			<label for="ManufacturerVersion"
				class="col-sm-4 control-label formLabel">Manufacturer
				Version</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="number" class="form-control" name="ManufacturerVersion"
					id="ManufacturerVersion" placeholder="Manufacturer Version">
			</div>
		</div>
		<div class="form-group">
			<label for="CostOfBike" class="col-sm-4 control-label formLabel">Cost
				of Bike</label>
			<div class="col-md-4 col-md-offset-0">
				<div class="input-group">
					<div class="input-group-addon">£</div>
					<input type="number" class="form-control" name="CostOfBike"
						id="CostOfBike" placeholder="Cost of Bike (£)">
				</div>
			</div>
		</div>
		<div class="form-group">
			<label for="PurchaseDate" class="col-sm-4 control-label formLabel">Purchase
				Date</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="date" class="form-control" name="PurchaseDate"
					id="PurchaseDate" placeholder="Purchase Date">
			</div>
		</div>
		<div class="form-group">
			<label for="BikeType" class="col-sm-4 control-label formLabel">Bike
				Type</label>
			<div class="col-md-4 col-md"">
				<select class="form-control" name="BikeType" id="BikeType">
					<option value="" disabled="" selected="">Select a Type</option>
					<option>Road Bike</option>
					<option>Mountain Bike</option>
					<option>BMX</option>
					<option>Kids Bike</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label for="BikeSize" class="col-sm-4 control-label formLabel">Bike
				Size</label>
			<div class="col-md-4 col-md-offset-0">
				<input type="number" class="form-control" name="BikeSize"
					id="BikeSize" placeholder="Bike Size">
			</div>
		</div>

		<!--  status dropdown -->
		<div class="form-group">
			<label for="Status" class="col-sm-4 control-label formLabel">Status</label>
			<div class="col-md-4 col-md-offset-0">
				<select class="form-control" name="Status" id="Status">
					<option value="" disabled="" selected="">Select a Status</option>
					<option>Available</option>
					<option>Rented</option>
					<option>Sold</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<div style="text-align: center;">
				<div class="">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>
		</div>
	</form>

	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</body>
</html>