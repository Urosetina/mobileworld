<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import = "model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the buyer page!</title>
</head>
	<body>
	
	<%
	
	User user = (User)session.getAttribute("user");
	
	%>
	
	
	
	<h1>Welcome buyer!</h1>
	<br>
	<h1><%= user.getUsername() %><h1>
	
	
	

	</body>
</html>