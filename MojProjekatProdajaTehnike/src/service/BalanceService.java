package service;

import model.User;
import validation.Validation;
import dao.BalanceDao;

public class BalanceService {

	BalanceDao dao = new BalanceDao();
	Validation v = new Validation();

	public User returnUserByUsername(String username) {
		
		
		return dao.returnUserByUsername(username);
	}

	public boolean addBalance(User user, Double balance) {
		
		
		
		return dao.addBalance(user, balance);
	}

	public boolean isBalanceADigit(String balance) {
		
		
		return v.isBalanceADigit(balance);
	}

	

	

	
	
	
	
	
	
	
}
