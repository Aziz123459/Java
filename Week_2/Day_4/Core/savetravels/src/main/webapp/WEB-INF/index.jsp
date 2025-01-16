<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" crossorigin="anonymous"></script>
    <meta charset="UTF-8">
    <title>Expense Tracker</title>
</head>
<body>
	<div class="container mt-4">
	    <table class="table table-striped">
	        <thead>
	            <tr>
	                <th>Expense Name</th>
	                <th>Vendor</th>
	                <th>Amount</th>
	                <th>Actions</th>
	            </tr>
	        </thead>
	        <tbody>
	<c:forEach var="travell" items="${travels}">
	<tr>
	<td><a href="/expense/${travell.id}">${travell.name}</a></td>
	<td>${travell.vendor}</td>
	<td>${travell.amount}</td>
	<td>
	    <a href="/expense/edit/${travell.id}" class="btn btn-primary btn-sm me-2">Edit</a>
	    <form action="/expense/delete/${travell.id}" method="POST" style="display: inline;">
	        <input type="hidden" name="_method" value="DELETE">
	        <button class="btn btn-danger btn-sm">Delete</button>
	    </form>
	    </td>
	</tr>
	</c:forEach>
	    </tbody>
	</table>
	
	<form:form modelAttribute="travel" method="POST" action="/expenses">
	<div class="row">
	    <div class="col-md-6">
	        <form:label path="name">Expense Name:</form:label>
	<form:input path="name" class="form-control"/>
	<form:errors class="badge text-danger" path="name"/>
	</div>
	<div class="col-md-6">
	    <form:label path="vendor">Vendor:</form:label>
	<form:input path="vendor" class="form-control"/>
	<form:errors class="badge text-danger" path="vendor"/>
	    </div>
	</div>
	<div class="row mt-3">
	    <div class="col-md-6">
	        <form:label path="amount">Amount:</form:label>
	<form:input type="number" path="amount" class="form-control"/>
	<form:errors class="badge text-danger" path="amount"/>
	</div>
	<div class="col-md-6">
	    <form:label path="description">Description:</form:label>
	<form:textarea path="description" class="form-control"></form:textarea>
	<form:errors class="badge text-danger" path="description"/>
	    </div>
	</div>
	<div class="row mt-4">
	    <div class="col">
	        <button type="submit" class="btn btn-primary">Save</button>
	    </div>
	</div>
	</form:form>
</div>
</body>
</html>
