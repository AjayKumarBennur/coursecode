<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Employee</h1>
	<form action="./employee" method="post">
		<input type="text" name="name" placeholder="employee name"><br>
		<input type="text" name="designation" placeholder="designation"><br>
		<input type="number" name="salary" placeholder="salary"><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>