<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "model.User" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Admin page!</title>
</head>
	<body>
	
	<jsp:useBean id = "user" scope = "session" class = "model.User"></jsp:useBean>
	
	<h1>Welcome Admin!</h1>
	<br>
	<h1>${user.username}</h1>
	
	<form action = "../AdminShowUsersController" method = "get">
	
	Search for all users, by user type:
	<br><br>
	
	<select name = "userType" id = "users">
		<option value = "buyer">Buyers</option>
		<option value = "seller">Sellers</option>
		<option value = "all">All</option>
		
	</select>
	
		<input type = "submit" value = "Show">
	
	</form>

	<br> <br>
	
	
	Search for all users, including their passwords:
	<br>
	
	<a href = "allUsers.jsp">All Users</a>
	<br> <br>
	<a href = "addBalance.jsp">Add Balance</a>
	<br> <br>
	

	
	
	</body>
</html>