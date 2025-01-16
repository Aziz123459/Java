<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
 <%@ page isErrorPage="true" %>  
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<a href="/expenses" class="btn btn-primary">Go Back</a>
<form:form modelAttribute="travel" method="POST" action="/expenses/edit/${id}">
<input type="hidden" name="_method" value="PUT">
<div>
	<form:label path="name">Expense Name:</form:label>
	<form:input path="name" class="form-control"/>
	<form:errors class="badge text-danger" path="name"/>
</div>
<div>
	<form:label path="vendor">Vendor:</form:label>
	<form:input path="vendor" class="form-control"/>
	<form:errors class="badge text-danger" path="vendor"/>
</div>
<div>
	<form:label path="amount">Amount:</form:label>
	<form:input type="number" path="amount" class="form-control"/>
	<form:errors class="badge text-danger" path="amount"/>
</div>
<div>
	<form:label path="Description">Description:</form:label>
	<form:textarea path="Description" class="form-control"/>
	<form:errors class="badge text-danger" path="Description"/>
</div>
<button type="submit" class="btn btn-primary mt-4">Save</button>
</form:form>
</div>
</body>
</html>