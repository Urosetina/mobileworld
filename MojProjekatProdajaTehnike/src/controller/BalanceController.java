package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.BalanceService;

@WebServlet(description = "Controller for adding balance", urlPatterns = { "/BalanceController" })
public class BalanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BalanceService service = new BalanceService();
		
		String username = request.getParameter("username");
		String balance = request.getParameter("balance");
		
		Double balanceForInsert = Double.parseDouble(balance);
		
		// Find user with requested user name above and do they exist;
		
		User user = service.returnUserByUsername(username);
		
		// Validate if balance written by admin are digits;
		
		boolean isBalanceDigit = service.isBalanceADigit(balance);
	
		
		if(user != null) {
		
			// If everything checks and user is found, add balance to requested user name;
			
			boolean isBalanceAdded = service.addBalance(user, balanceForInsert);
			
			
			
			
			if(isBalanceAdded && isBalanceDigit == true) {
				
				// If balance is added, redirect to main admin page;
				
				response.sendRedirect("jsp/admin.jsp");
				
			} else {
				
				// if balance isn't added, redirect back to addBalance page;
				
				response.sendRedirect("jsp/balanceDigit.jsp");
			}
			
			
		} else {
			
			response.sendRedirect("html/userNotFound.html");
		}
		
	}

}
