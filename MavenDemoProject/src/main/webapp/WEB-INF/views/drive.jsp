<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Drive</title>
</head>
<body>

	<%
		String name = (String) request.getAttribute("name");
		int id = (Integer) request.getAttribute("id");
		List<String> subjects = (List<String>) request.getAttribute("sub");
	%>
	<h1>
		Name is
		<%=name%>
	</h1>
	<h1>
		Enrollment Id is
		<%=id%>
	</h1>
	<h1>
		<%
			for (String s : subjects) {
		%>
		<h1><%=s%></h1>
		<%
			}
		%>
	
	</h1>

</body>
</html>