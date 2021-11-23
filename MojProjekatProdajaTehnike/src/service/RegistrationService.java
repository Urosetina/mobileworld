package service;

import common.CommonMethods;
import dao.RegistrationLoginDao;
import validation.Validation;
import model.User;
import model.UserDetails;


public class RegistrationService {

	Validation val = new Validation();
	CommonMethods methods = new CommonMethods();
	RegistrationLoginDao dao = new RegistrationLoginDao();
	
	public void writeParameters(String username, String password, String repeatedPassword, String userType) {
		
		
		val.writeParameters(username, password, repeatedPassword, userType);
	}

	public boolean checkPassword(String password, String repeatedPassword) {
		
		return val.checkPassword(password, repeatedPassword);
	}

	public User fillUser(String username, String password, String userType) {
		
		return methods.fillUser(username, password, userType);
	}

	public boolean addUser(User user) {
		
		
		return dao.addUser(user);
	}

	
	
	
	
	
	
	
	
	
	
}
