package com.vishal.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.entity.User;

@RestController
@RequestMapping("/Advertise")
public class UserController {

	static int i=1;
	List<User> userlist=new ArrayList<User>(); 


	@RequestMapping(value="/newuser", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public User createNewOrder(@RequestBody User user) {
		System.out.println("New user register!!");
		user.setUserId(i++);
		userlist.add(user);
		
		return user;

	}



	@RequestMapping(headers={"auth_token"},value = "/logoutperson", method = RequestMethod.POST)
	public boolean login(@RequestHeader(value="auth_token") String token) {
		if(token!=null)
			System.out.println("Logout Successful");
		else
			System.out.println("Login first");
		return true;
	}
	
	
	   @RequestMapping(headers={"auth_token"},value = "/loginperson", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	     public boolean login(@RequestBody User user) {
	           if(user.getName().equals(user.getPassord()))
	                System.out.println("Login Successful");
	           else
	                System.out.println("Login failure");
	           return true;
	     }

	   @RequestMapping(headers={"auth_token"},value = "/user/{uid}", method = RequestMethod.POST)
		public User userinfo(@RequestHeader(value="auth_token") String token,@PathVariable (value="uid")int uid) {
		 Iterator itr=userlist.iterator();
			if(token!=null)
			{
				for (Iterator iterator = userlist.iterator(); iterator.hasNext();) {
					User user = (User) iterator.next();
					if(user.getUserId()==uid)
					{
						return user;
					}
				}
			}
			else
				System.out.println("Login first");
			return null;
		}
		
	   
	   
}
