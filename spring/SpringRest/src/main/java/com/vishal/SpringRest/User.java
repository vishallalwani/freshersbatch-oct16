package com.vishal.SpringRest;

public class User {
	private int userId;
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
	
	
}
