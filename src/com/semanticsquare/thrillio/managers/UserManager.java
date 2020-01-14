package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.dao.UserDao;
import com.semanticsquare.thrillio.entities.User;

public class UserManager {
	private static UserManager instance = new UserManager();
	private static UserDao dao = new UserDao();
	
	
	private UserManager() {
		//No one can instantiate
		//We want to make our 'Manager/Service'
		//class in M of MVC as Singleton
	}
	 
	//If private constructor and you have to 
	//return a single instance of this class
	
	public static UserManager getInstance() {
		return instance;
	}
	
	public User createUser(long id,String email,String password,String firstName,String lastName,int gender,String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;
	}
	
	public User[] getUsers() {
		return dao.getUsers();
	}
}
