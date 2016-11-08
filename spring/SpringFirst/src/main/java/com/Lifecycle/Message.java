package com.Lifecycle;

import org.springframework.beans.factory.BeanNameAware;

public class Message implements BeanNameAware {

	private String message = null;

	public Message() {
		System.out.println("MessagePrinterBean created!!");
	}

	public void initBean() {
		System.out.println("Inside initBean()");
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage(): " + message);
	}

	public void printMessage() {
		System.out.println(message);
	}
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);
	}
}

