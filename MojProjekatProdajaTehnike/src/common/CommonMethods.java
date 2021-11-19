package common;

import model.User;
import model.UserType;

public class CommonMethods {

	public User fillUser(String username, String password, String userType) {
		
		User user = new User();
		
		user.setUsername(username);
		user.setPassword(password);


		if(userType.equals("0")) {
			
			user.setUserType(UserType.BUYER);
			
		} else if (userType.equals("1")){
			
			user.setUserType(UserType.SELLER);
		}
		
		
		return user;
	}

}
