<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Omikuji!</title>
</head>
<body>
<div>
<h1>Here's Your Omikuji!</h1>
<div>
<h2>In <c:out value="${num}"></c:out> years, you will live in <c:out value="${city}"></c:out> with <c:out value="${person}"></c:out> 
 as your roomate, selling <c:out value="${hobby}"></c:out>
  for living. The next time you see <c:out value="${thing}"></c:out>,
  you will have good luck. Also, <c:out value="${smth}"></c:out></h2>
</div>
</div>
</body>
</html>