<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>SEND AN OMIKUJI!</h1>
<form action="/apply" method="post">
	<h3 class="text-danger">${yearError}</h3>
	Pick any number from 5 to 25:<input class="form-control col-6" name="num" type="number"><br/>
	Enter the name of any city:<input class="form-control col-6" name="city"><br/>
	Enter the name of any real person:<input class="form-control col-6" name="person"><br/>
	Enter professional endeavor or hobby:<input class="form-control col-6" name="hobby" ><br/>
	Enter any type of living thing:<input class="form-control col-6" name="thing"><br/>
	Say something nice to someone:<textarea name="smth" class="form-control col-6"></textarea>
	<button>send</button>
</form>
</div>
</body>
</html>