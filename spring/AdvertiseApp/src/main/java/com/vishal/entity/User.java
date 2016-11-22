package com.vishal.entity;

public class User {
	private String firstName;
	private String lastName;
	
	private int userId;
	private String email;
	private int phone;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private String name;
	private String passord;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String passord) {
		
		this.name = name;
		this.passord = passord;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Login [name=" + name + ", passord=" + passord + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassord() {
		return passord;
	}
	public void setPassord(String passord) {
		this.passord = passord;
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
	public User(String firstName, String lastName, int userId, String email, int phone, String name, String passord) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.email = email;
		this.phone = phone;
		this.name = name;
		this.passord = passord;
	}
	
	
}
