package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.RegistrationService;


@WebServlet(description = "Servlet for registration", urlPatterns = { "/PathToReg" })
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Welcome to doGet method!");
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RegistrationService service = new RegistrationService();
		
		System.out.println("Welcome to doPost method!");
		
		String realName = request.getParameter("realName");
		String lastName = request.getParameter("lastName");
		String country = request.getParameter("country");
		String city = request.getParameter("city");
		String street = request.getParameter("street");
		String phoneNumber = request.getParameter("number");
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		String repeatedPassword = request.getParameter("repeatedPassword");
		String userType = request.getParameter("userType");
		
		
		service.writeParameters(realName, lastName, country, city, street, phoneNumber,
								username, password, repeatedPassword, userType);
		
		
		boolean checkPassword = service.checkPassword(password, repeatedPassword);
			
			if(checkPassword) {
				
				if(password.equals(repeatedPassword)) {
					
					// Fill in usernames
					User user = service.fillUser(username, password, userType);
					
					// Save user in DB
					boolean isUserAddedToDb = service.addUser(user);
					
						if(isUserAddedToDb == true) {
							
							response.sendRedirect("index.html");
							
						} else {
							
							response.sendRedirect("html/reg.html");
						}
					
				} else {
					
					response.sendRedirect("html/wrongRepeatedPassword.html");
				}
				
			} else {
				
				response.sendRedirect("html/wrongpassword.html");
			}
		
			
		
		
			
		
		
		
	}

}
