<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Next Step</title>
</head>
<body>
	<h3 class="text-center">${Header }</h3>
	<h4 class="text-center">${Desc}</h6>	
	<h2 style="color:blue">${msg}</h2>
	
	<hr>
	

	<h3>Email is ${user.email }</h3>
	<h3>Welcome, ${user.name }</h3>
	<h3>Password is ${user.password }</h3>

	
</body>
</html>