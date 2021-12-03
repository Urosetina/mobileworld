package common;

import model.Adress;
import model.User;
import model.UserDetails;
import model.UserType;

public class CommonMethods {

	public User fillUser(String username, String password, String userType) {
		
		User user = new User();
		
		user.setUsername(username);
		user.setPassword(password);
		if(userType.equals("0")) {
			
			user.setUserType(UserType.BUYER);
			
		} else {
			
			user.setUserType(UserType.SELLER);
		}
		
		
		return user;
	}

	public void writeParameters(String userName, String password) {
		
		System.out.println("Login parameters: ");
		System.out.println("Username: " + userName);
		System.out.println("Password: " + password);
		
		
	}

	public UserType returnUserType(String userType) {
		
		UserType type = null;
		
		if(userType.equals("buyer")) {
			
			type = UserType.BUYER;
			
		} else if(userType.equals("seller")) {
			
			type = UserType.SELLER;
			
		} 
		
		return type;
		
		
	}

	

}
