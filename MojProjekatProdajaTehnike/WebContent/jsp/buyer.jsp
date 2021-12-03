<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   <%@ page import = "model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the buyer page!</title>
</head>
	<body>
	
	<jsp:useBean id = "user" scope = "session" class = "model.User"></jsp:useBean>
	
	
	
	<h1>Welcome buyer!</h1>
	<br>
	<h1>${user.username}</h1>
	
	
	

	</body>
</html>