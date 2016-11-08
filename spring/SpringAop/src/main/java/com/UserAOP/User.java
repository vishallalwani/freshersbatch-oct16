package com.UserAOP;

public class User {
	private String loginName;
	private String password;
	private String firstName;
	private String country;
	
public User() {
	// TODO Auto-generated constructor stub
}
	public User(String username, String password, String fullName,
            String country) {
        super();
        this.loginName = username;
        this.password = password;
        this.firstName = fullName;
        this.country = country;
    }
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
