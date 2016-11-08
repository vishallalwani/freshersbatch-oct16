package com.vishal.SpringAop;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class Main{  
	
	public static void main(String[] args){  
		ApplicationContext context = new  ClassPathXmlApplicationContext("add.xml");

		AddingOperation op = (AddingOperation) context.getBean("operationBean");  
		System.out.println("list time:");
		op.addInList();
		System.out.println("vector time:");
		op.addInVector();  
	}  
}  