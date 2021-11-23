package service;

import common.CommonMethods;
import dao.RegistrationLoginDao;
import validation.Validation;

public class LoginService {

	
	CommonMethods methods = new CommonMethods();
	Validation v = new Validation();
	RegistrationLoginDao dao = new RegistrationLoginDao();
	
	public void writeParameters(String userName, String password) {
		
		methods.writeParameters(userName, password);
	}

	public boolean validateUser(String userName, String password) {
		
		
		
		return v.validateUser(userName, password);
	}

	
	
	
	
	
	
}
