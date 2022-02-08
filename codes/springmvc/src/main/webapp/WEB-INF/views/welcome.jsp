<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String s = (String) request.getAttribute("name"); %>
	Welcome <%= s %>
	<a href="./mail"> Click her to send a mail </a>
	<a href="./inbox"> Click her to check the mail</a>
</body>
</html>