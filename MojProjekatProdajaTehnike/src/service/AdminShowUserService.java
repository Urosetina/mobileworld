package service;

import java.util.List;

import common.CommonMethods;
import dao.AdminDao;
import model.User;
import model.UserType;

public class AdminShowUserService {

	CommonMethods methods = new CommonMethods();
	AdminDao dao = new AdminDao();

	public UserType returnUserType(String userType) {
		
		
		
		return methods.returnUserType(userType);
	}

	public List<User> returnUserByType(UserType type) {
		
		
		
		return dao.returnUserByType(type);
	}

	
	
	
	
	
	
}
