<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<div class="container mt-5">
<h1 style="color:#FFB6C1">Fruit Store</h1>
<table class="table table-striped" style="border:30px solid #FFB6C1" >
<thead>
	<th>name</th>
	<th>price</th>
</thead>
<tbody>
<tr>
<c:forEach var="item" items="${fruits}">
	<td><c:out value="${item.name}"></c:out></td>
	<td><c:out value="${item.price}"></c:out></td>
	
</tr>
</c:forEach>
</tbody>
</table>
</div>

</ul>
</body>
</html>