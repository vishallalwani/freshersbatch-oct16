package com.UserAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.SpringAop.AddingOperation;

public class UserMain {
	
	public static void main(String[] args){  
		ApplicationContext context = new  ClassPathXmlApplicationContext("user_reg.xml");

		UserHandler uh = (UserHandler) context.getBean("userhandler");  
		uh.register("vi","12345","vishal","india");
		uh.login("vishal", "12345");
		try {
			uh.logout();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  
}
