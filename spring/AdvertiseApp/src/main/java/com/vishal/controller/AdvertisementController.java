package com.vishal.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.entity.Advertisement;
import com.vishal.entity.User;

@RestController
@RequestMapping("/Advertise")
public class AdvertisementController {
	
	
     @RequestMapping(value = "/newadvertise", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
     public Advertisement advertise(@RequestBody Advertisement advertise) {
    	 System.out.println("New advertisement created!!");

    	advertise.setAdvertiseId(130);
    	
    		return advertise;
    	}
  

     @RequestMapping(value = "/updateadvertise", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
     public Advertisement advertise1(@RequestBody Advertisement advertise) {
    	 System.out.println(" advertisement updated!!");
    	
    		return advertise;
    	}
  
}