package com.vishal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.entity.Advertise;
import com.vishal.entity.User;
import com.vishal.service.AdvertiseService;
import com.vishal.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public User createAdvertise(@RequestBody User user) {
		return userService.create(user);
	}

	
	@RequestMapping(headers={"auth_token"},value = "/loginperson", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User login(@RequestBody User user) {
		return userService.create(user);
    }
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
