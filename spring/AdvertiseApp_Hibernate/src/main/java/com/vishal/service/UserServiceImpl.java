package com.vishal.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.vishal.dao.UserDAO;
import com.vishal.entity.User;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	public User create(User user)
	{
		return userDao.create(user);
	}

}
