package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserType;
import service.LoginService;


@WebServlet("/PathToLog")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		
		LoginService service = new LoginService();
			service.writeParameters(userName, password);
		
		
		// Validation: Both user and password must be filled (not null)
			
			
			boolean areUserOrPassEmptyOrNull = service.validateUserAndPassword(userName, password);
			
			
			
		// Search through database and check if user exists
			
			User user = service.findUserByUsernameAndPassword(userName, password);
			
			if(user == null && !areUserOrPassEmptyOrNull) {
				
				response.sendRedirect("html/logFailed.html");
				
			} else {
				
				// Add user in http session object
				HttpSession session = request.getSession();
					session.setAttribute("user", user);
					
					
				
				// If user exists, return user and redirect to their page
				if(user.getUserType().equals(UserType.BUYER)) {
					
					// switch over to buyer page
				response.sendRedirect("jsp/buyer.jsp");	
					
					
					
				} else if (user.getUserType().equals(UserType.SELLER)) {
					
					// switch over to seller page
					
					response.sendRedirect("jsp/seller.jsp");
					
				} else {
					
					/* if other, switch over to admin page
					 * No other enums besides
					 * BUYER, SELLER, ADMIN
					 */
					
					response.sendRedirect("jsp/admin.jsp");
				}
				
				
			}
			
			
		
		
		
		
		
		
	}

}
