package com;

import java.io.Serializable;

public class Date implements Serializable
{
	private int day,month,year;
	
	public Date()
	{
		this.day=17;
		this.month=10;
		this.year=2016;
	}
	
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DATE"+this.day+"/"+this.month+"/"+this.year;
	}
}