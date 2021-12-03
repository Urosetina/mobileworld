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
		
		
		
		// Find user with requested user name above and do they exist;
		
		User user = service.returnUserByUsername(username);
		
	
		if(user != null) {
		
			// Check if written balance by admin is not a string;
			boolean isBalanceDigit = service.isBalanceADigit(balance);
			
			Double balanceForInsert = null;
			
			if(isBalanceDigit) {
				
				 balanceForInsert = Double.parseDouble(balance);	
			}
			
			
			
			// Check if balance was added
			boolean isBalanceAdded = service.addBalance(user, balanceForInsert);
			
			
			if(isBalanceAdded) {
				
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
