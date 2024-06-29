<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="Offers.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Offers</title>
<link rel="stylesheet" href="retrieve.css">
</head>
<body>

<h1>Offers</h1>

<%
List<offers> off = (List<offers>) request.getAttribute("offerlist");
%>

<div class="card-container">
    <% if(!off.isEmpty()) {
        for(offers o : off) {
    %>
    <div class="card">
        <div class="card-header">
            <h2><%= o.getOffername() %></h2>
            <p>Offer ID: <%= o.getOfferid() %></p>
        </div>
        <div class="card-body">
            <p><strong>Description:</strong> <%= o.getDescription() %></p>
            <p><strong>Start Date:</strong> <%= o.getStartdate() %></p>
            <p><strong>End Date:</strong> <%= o.getEnddate() %></p>
            <p><strong>Discount Percentage:</strong> <%= o.getPercentage() %></p>
            <p><strong>Coupon Code:</strong> <%= o.getCouponcode() %></p>
        </div>
        <div class="card-footer">
            <a href="updateForm?oID=<%= o.getOfferid() %>"><button id="edit">Edit</button></a>
            <a href="deleteOfferServlet?oID=<%= o.getOfferid() %>"><button id="delete">Delete</button></a>
        </div>
    </div>
    <% 
        }
    } %>
</div>

</body>
</html>
