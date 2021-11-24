package service;

import common.CommonMethods;
import dao.RegistrationLoginDao;
import model.User;
import validation.Validation;

public class LoginService {

	
	CommonMethods methods = new CommonMethods();
	Validation v = new Validation();
	RegistrationLoginDao dao = new RegistrationLoginDao();
	
	public void writeParameters(String userName, String password) {
		
		methods.writeParameters(userName, password);
	}


	public User findUserByUsernameAndPassword(String userName, String password) {
		
		
		
		return dao.findUserByUsernameAndPassword(userName, password);
	}

	

	public boolean validateUserAndPassword(String userName, String password) {
		
		return v.validateUserAndPassword(userName, password);
	}

	
	
	
	
	
	
}
