package com.vishal.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vishal.dao.AdvertiseDAO;
import com.vishal.entity.Advertise;

public class AdvertiseServiceImpl implements AdvertiseService {

	@Autowired
	private AdvertiseDAO advertiseDao;
	
	public Advertise create(Advertise advertise) {
		return advertiseDao.create(advertise);
	}

}
