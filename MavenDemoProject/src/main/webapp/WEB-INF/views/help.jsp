<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.time.LocalDateTime" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help</title>
</head>
<body>
	<%-- <%
		String name = (String) request.getAttribute("name");
		List<String> hobby = (List<String>) request.getAttribute("hobby");
		LocalDateTime time=(LocalDateTime) request.getAttribute("localdatetime");
	%>
	<h1>
		Name is
		<%=name%>
	</h1>

	<h2>My hobbies are</h2>
	<%
		for (String h : hobby) {
	%>
	<h3>
		<%=h%></h3>
	<%
		}
	%><h4> Date time is <%=time %></h4> --%>
	
	<h1>My name is ${name }</h1>
	<c:forEach var="item" items="${hobby }">
		<h2>${item }</h2>
		<h4><c:out value="${item }"></c:out></h4>
	</c:forEach>
	<h3> Time ${localdatetime }</h3>
</body>
</html>