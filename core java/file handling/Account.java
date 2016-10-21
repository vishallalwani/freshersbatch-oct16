package com;

import java.io.Serializable;

public class Account implements Serializable{
	int id;
	transient String name;
	Date d; 
	private static final long serialVersionUID = 5l;
	
	public Account(int id,String name,Date d) {
		// TODO Auto-generated constructor stub
	this.id=id;
	this.name=name;
	this.d=d;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account Details: "+this.id+"\t"+this.name+"\t"+this.d;
}
}
