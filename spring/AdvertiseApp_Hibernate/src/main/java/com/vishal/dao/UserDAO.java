package com.vishal.dao;

import com.vishal.entity.User;

public interface UserDAO {
	public User create(User user);
	public User login(User user);
}
