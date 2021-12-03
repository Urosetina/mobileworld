package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserType;
import model.User;
import service.AdminShowUserService;


@WebServlet("/AdminShowUsersController")
public class AdminShowUsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdminShowUserService service = new AdminShowUserService();
		
		String userType = request.getParameter("userType");
			System.out.println("Parameter: " + userType);

			// Return user;
		UserType type = service.returnUserType(userType);
		
			// Return all users by admin choice;
		
		List<User> users = service.returnUserByType(type);
		
		
			if(users != null && !users.isEmpty()) {
				
				// User list placed in request object;
				request.setAttribute("users", users);
				
				// Redirecting using existing request;
				RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/showUsers.jsp");
				// Place request in response;
				dispatcher.forward(request, response);
				
			} else {
				
				response.sendRedirect("jsp/admin.jsp");
			}
				
				
	}
		
		
		
	

}
