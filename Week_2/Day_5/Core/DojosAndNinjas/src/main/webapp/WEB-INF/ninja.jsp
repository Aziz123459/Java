
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New ninja</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>

<div class="container p-5"><form:form class="col-6 p-5" action="/createNinja" method="post" modelAttribute="ninja">
	    <h1 class="text-primary">New Ninja</h1>
	    <div class="p-3">
	        <form:label path="dojo">Dojo :</form:label>
	        
	        <form:select path="dojo">
	        <c:forEach items="${allDojos}" var="one" >
	        <option value="${one.id }">${one.name }</option>
	        </c:forEach>
	        </form:select>
	        <form:errors class="row text-danger" path="dojo"/>
	    </div>
	    <div class="p-3">
	        <form:label path="firstname">First Name :</form:label>
	        <form:input class="col-6" path="firstname"/>
	        <form:errors class="row text-danger" path="firstname"/>
	    </div> 
	    <div class="p-3">
	        <form:label path="lastname">Last Name :</form:label>
	        <form:input class="col-6" path="lastname"/>
	        <form:errors class="row text-danger" path="lastname"/>
	    </div>
	    <div class="p-3">
	        <form:label path="age">Age :</form:label>
	        <form:input type="number" class="col-6" path="age"/>
	        <form:errors class="row text-danger" path="age"/>
	    </div>  
	    <input class="col-4 btn btn-success m-3" type="submit" value="Create"/>
	</form:form> </div>
	
	
</body>
</html>