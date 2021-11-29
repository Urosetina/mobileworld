<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "model.User" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Admin page!</title>
</head>
	<body>
	
	<% User user = (User) session.getAttribute("user"); %>
	
	<h1>Welcome Admin!</h1>
	<br>
	<h1><%=user.getUsername() %></h1>
	
	
	
	<a href = "allUsers.jsp">All Users</a>
	<br> <br>
	<a href = "addBalance.jsp">Add Balance</a>
	<br> <br>
	<a href = "removeBalance.jsp">Remove Balance</a>
	
	
	
	
	
	
	
	
	</body>
</html>