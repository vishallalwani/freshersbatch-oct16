package com.vishal.hibernateMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ENQUIRY")
public class Enquiry {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="enquiry")
	private String enquiry;
	
	public Enquiry() {
		// TODO Auto-generated constructor stub
	}
	
	public Enquiry(String enquiry) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.enquiry=enquiry;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(String enquiry) {
		this.enquiry = enquiry;
	}
	public String toString() {
		return id + " - "+ enquiry;
	}
}
