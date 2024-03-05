<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="UserLoginServlet" method="post">
	    <label for="email">Email:</label>
	    <input type="email" id="email" name="email" required><br>
	
	    <label for="password">Password:</label>
	    <input type="password" id="password" name="password" required><br>
	
	    <input type="submit" value="Login" />
  	</form>

</body>
</html>