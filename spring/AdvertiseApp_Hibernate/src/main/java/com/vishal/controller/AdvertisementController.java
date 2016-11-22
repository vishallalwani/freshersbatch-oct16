package com.vishal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.entity.Advertise;
import com.vishal.service.AdvertiseService;

@RestController
public class AdvertisementController {

	@Autowired
	private AdvertiseService advertiseService;
	
	@RequestMapping(value="/postAd", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Advertise createAdvertise(@RequestBody Advertise advertise) {
		return advertiseService.create(advertise);
	}

	public AdvertiseService getAdvertiseService() {
		return advertiseService;
	}

	public void setAdvertiseService(AdvertiseService advertiseService) {
		this.advertiseService = advertiseService;
	}
	
}
