<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./register" method="post">
		Name : <input type="text" name="name" ><br><br>
		Password : <input type="password" name="password"><br><br>
		Phone Number : <input type="number" name="phoneNumber"><br><br>
		Email : <input type="email" name="email"><br><br>
		Gender : Male <input type="radio" name="gender" value="male"> 
				Female<input type="radio" name="gender" value="female"><br>
		<!-- Hobbies :  Cricket<input type="checkbox" name="hobbies" value="Cricket">
				   VolleyBall<input type="checkbox" name="hobbies" value="volleyball">
				   Football<input type="checkbox" name="hobbies" value="football"> -->
		<input type="submit" value="Submit">
	</form>
</body>
</html>