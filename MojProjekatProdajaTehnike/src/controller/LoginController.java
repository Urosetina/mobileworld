package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			
			boolean areUserAndPassNull = service.validateUser(userName, password);
			
			if(!areUserAndPassNull) {
				
				response.sendRedirect("");
				
			} else {
				
				response.sendRedirect("");
			}
			
				
			
			
			
		// Search through database and check if user exists
			
			
			
		// If user exists, return user and redirect to their page
		
		
		
		
		
	}

}
