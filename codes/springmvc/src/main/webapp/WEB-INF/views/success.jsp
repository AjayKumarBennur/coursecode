<%@page import="java.util.HashMap"%>
<%@page import="com.te.spring.dto.RegisterModel"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	RegisterModel reg = (RegisterModel) request.getAttribute("data");
	%>
	<%= reg %>
	
	<h1> Data entered Successfully <%= reg %></h1>
	
</body>
</html>