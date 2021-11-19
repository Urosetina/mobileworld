package service;

import common.CommonMethods;
import dao.RegistrationLoginDao;
import validation.Validation;
import model.User;


public class RegistrationService {

	Validation val = new Validation();
	CommonMethods methods = new CommonMethods();
	RegistrationLoginDao dao = new RegistrationLoginDao();
	
	public void writeParameters(String realName, String lastName, String country,
								String city, String street, String phoneNumber, String username,
								String password, String repeatedPassword, String userType) {
		
		
		val.writeParameters(realName, lastName, country, city, street, phoneNumber,
							username, password, repeatedPassword, userType);
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
