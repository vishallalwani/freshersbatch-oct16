package com;

public class RandomAccessMain {
	public static void main(String[] args) {
		BankAccess ba=new BankAccess();
		ba.add(1,"vishal",123456);
		ba.add(2,"piyush",500000);
		ba.read();
		
	}
}
