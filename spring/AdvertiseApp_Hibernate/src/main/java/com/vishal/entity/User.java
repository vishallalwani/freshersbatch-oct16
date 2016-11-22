package com.vishal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USERS")
public class User {
	
	
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int userId;
	
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE")
	private int phone;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	public String getuserName() {
		return username;
	}
	
	public void setuserName(String name) {
		this.username = name;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public User(String firstName, String lastName, int userId, String email, int phone, String name, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.email = email;
		this.phone = phone;
		this.username = name;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [name=" + username + ", password=" + password + "]";
	}
}
