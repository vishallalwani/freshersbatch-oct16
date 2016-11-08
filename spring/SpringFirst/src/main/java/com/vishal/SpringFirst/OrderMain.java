package com.vishal.SpringFirst;

import java.lang.reflect.Array;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMain {
private static int sum=0;
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Order[] ar=new Order[2];
		ar[0]=(Order) context.getBean("order");
	
		ar[1] = (Order) context.getBean("order1");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Order Details: " + ar[i].getName() + "\t" + ar[i].getItem());
			sum=sum+ar[i].getItem().getPrice();
		}
		System.out.println("sum="+sum);
		context.registerShutdownHook();
	}
}
