<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red">${ErrorMessage }</font>
 	<form method="post">
 	Name: <input type="text" name="Name">
 	password: <input type="password" name="password">
 	<input type="submit" value="login">
	</form>
</body>
</html>