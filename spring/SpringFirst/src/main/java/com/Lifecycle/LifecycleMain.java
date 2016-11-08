package com.Lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleMain {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("msg.xml");

        Message message = (Message) context.getBean("messagePrinters");

        context.close();
        context.registerShutdownHook();
    }

}