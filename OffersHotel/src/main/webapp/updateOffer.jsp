<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="Offers.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Update Offer</title>
    <link rel="stylesheet" type="text/css" href="insertForm.css">
</head>
<body>

<div class="outer-container">
    <div class="container">
        <h1>Update Offer Info</h1>
        <c:forEach var="off" items="${selectedOffer}">
            <form action="UpdateOfferServlet" method="post">
                <label for="offerID">Offer ID</label>
                <input type="text" id="offerID" name="offerID" value="${off.offerid}" readonly>

                <label for="offerName">Offer Name</label>
                <input type="text" id="offerName" name="offerName" value="${off.offername}">

                <label for="description">Description</label>
                <textarea id="description" name="description" rows="4" cols="50">${off.description}</textarea>

                <label for="startDate">Start Date</label>
                <input type="date" id="startDate" name="startDate" value="${off.startdate}">

                <label for="endDate">End Date</label>
                <input type="date" id="endDate" name="endDate" value="${off.enddate}">

                <label for="discountPercentage">Discount Percentage</label>
                <input type="number" id="discountPercentage" name="discountPercentage" value="${off.percentage}" max="20">

                <label for="couponCode">Coupon Code</label>
                <input type="text" id="couponCode" name="couponCode" value="${off.couponcode}">

                <input type="submit" id="submit" value="Update">
            </form>
        </c:forEach>
        </div>
    <div class="top-button-container">
    	<form action="retriveoffersservlet" method="post">
        	<input type="submit" id="viewOffers" value="View Offers">
        </form>
    </div>
    </div>
</div>

</body>
</html>
