<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "model.User" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
	<body>
	
	<jsp:useBean id = "users" scope = "request" class = "java.util.ArrayList"></jsp:useBean>
	
	<h1>User Table</h1>
	
		<table border = 2px>
		
		<tr>
		
		<th>Username</th>
		<th>Password</th>
		<th>User Type</th>
		
		</tr>
		
			<c:forEach var = "u" items = "${users}">
			
			<tr>
			
			<td>${u.username}</td>
			<td>${u.password}</td>
			<td>${u.userType}</td>
			
			</tr>
			
			</c:forEach>
		
		
		
		
		
		</table>
	<br> <br>
	
	<a href = "jsp/admin.jsp">Back to Admin page</a>
	
	
	
	
	</body>
</html>