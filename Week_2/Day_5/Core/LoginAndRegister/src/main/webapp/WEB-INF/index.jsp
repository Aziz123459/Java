<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 class="text-center mt-3">Registration</h1>
<form:form action="/register" method="POST" modelAttribute="newUser" class="container col-3 card p-3">
<div>
<form:label  path="username">User Name:</form:label>
<form:input class="form-control" path="username"/>
<form:errors path="username" class="text-danger"></form:errors>
</div>
<div>
<form:label path="email">Email:</form:label>
<form:input class="form-control" path="email"/>
<form:errors path="email" class="text-danger"></form:errors>
</div>
<div>
<form:label path="password">Password:</form:label>
<form:input class="form-control" type="password" path="password"/>
<form:errors path="password" class="text-danger"></form:errors>
</div>
<div>
<form:label path="confirm">Confirm Password:</form:label>
<form:input class="form-control" type="password" path="confirm"/>
<form:errors path="confirm" class="text-danger"></form:errors>
</div>
<button class="btn btn-success mt-2">Register</button>
</form:form>
<hr>
<h1 class="text-center">Login</h1>
<form:form action="/login" method="POST" modelAttribute="newLogin" class="container col-3 card p-3">
<div>
<form:label path="email">Email:</form:label>
<form:input class="form-control" path="email"/>
<form:errors path="email" class="text-danger"></form:errors>
</div>
<div>
<form:label path="password">Password:</form:label>
<form:input class="form-control" type="password" path="password"/>
<form:errors path="password" class="text-danger"></form:errors>
</div>
<button class="btn btn-success mt-2 ">Login</button>
</form:form>
</body>
</html>