package com.UserAOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserHandler {

	List<User> userlist;
	 public static String currentUser = null;

	 public UserHandler() {
	        userlist = new ArrayList<User>();
	    }
	
	 public void login(String username,String password) {
		// TODO Auto-generated method stub
		for(User user:userlist)
		{
			if(user.getLoginName().equals(username) && user.getPassword().equals(password))
					{
				System.out.println("login successfully");
					}
			
		}
		currentUser = username;
	}
	public void logout() throws Exception {
		// TODO Auto-generated method stub
		  if (currentUser == null) {
	            throw new Exception();
	        } else {
	            currentUser = null;
	            System.out.println("logout successful");
	        }
	}
	
	public void register(String username,String password,String firstname,String country) {
		// TODO Auto-generated method stub
		User user=new User( username,password,firstname,country);
		userlist.add(user);
		System.out.println("register successfully");
	}
}
