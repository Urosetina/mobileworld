<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Balance</title>
</head>
	<body>
	
	<h1>Add Balance</h1>
	
	
	<form action = "../BalanceController" method = "get">
	
	Username: <input type = "text" name = "username">
				<br> <br>
	Balance: <input type = "text" name = "balance">
	
	<input type = "submit" value = "Add Balance">
	
	
	</form>
	
	<br> <br>
	<a href = "admin.jsp">Back to admin page</a>
	
	</body>
</html>