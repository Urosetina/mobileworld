<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "model.User" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users</title>
</head>
	<body>
	
	
	
	<p>Form for searching every registered user:</p>
	<form action = "../AdminController" method = "get">
	
	<input type = "submit" value = "Search">
	
	</form>
	
	<%
	
	List<User> userList = (List<User>)request.getAttribute("userList");
	
	%>
	
	<table border = "2px">
		
		<tr>
			
			<th>Id</th>
			
			<th>Username</th>
			
			<th>Password</th>
			
			<th>User Type</th>
			
		
		</tr>
		
		<%
		
		if(userList != null){
		for(User u : userList){
		
		
		%>
		
		<tr>
			<td><%=u.getIdUser() %></td>
			<td><%=u.getUsername() %></td>
			<td><%=u.getPassword() %></td>
			<td><%=u.getUserType() %></td>
			
		</tr>
		
		
		<%
			}
		}
		
		%>
		
		
	</table>
	
	<br> <br>
	
	<a href = "admin.jsp">Back to Admin page</a>
	<br> <br>
	<a href = "jsp/admin.jsp">Back to admin page after results</a>
	
	
	
	</body>
</html>