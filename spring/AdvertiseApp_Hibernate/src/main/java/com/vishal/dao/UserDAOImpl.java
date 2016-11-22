package com.vishal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


import com.vishal.entity.User;

public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public User create(User user) {
		hibernateTemplate.save(user);
		return user;
	}

	@Transactional
	public User login(User user) {
		hibernateTemplate.load(User.class);
		return null;
	}

	
	

}
