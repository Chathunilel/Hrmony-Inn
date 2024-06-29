<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="insertForm.css">
</head>
<body>

<div class="outer-container">
    <div class="container">
        <h1>Add A New Offer</h1>
        <form action="OfferInsert" method="post">
            <label for="offerName">Offer Name</label>
            <input type="text" id="offerName" name="Offer Name">

            <label for="description">Description</label>
            <textarea id="description" name="description" rows="4" cols="50"></textarea>

            <label for="startDate">Start Date</label>
            <input type="date" id="startDate" name="Start Date">

            <label for="endDate">End Date</label>
            <input type="date" id="endDate" name="End Date">

            <label for="discountPercentage">Discount Percentage</label>
            <input type="number" id="discountPercentage" name="Discount Percentage" step="1" max="20">

            <label for="couponCode">Coupon Code</label>
            <input type="text" id="couponCode" name="Coupon Code">

            <input type="submit" id="submit" value="Add Offer">
        </form>
    </div>
    <div class="top-button-container">
    	<form action="retriveoffersservlet" method="post">
        	<input type="submit" id="viewOffers" value="View Offers">
        </form>
    </div>
</div>

</body>
</html>
