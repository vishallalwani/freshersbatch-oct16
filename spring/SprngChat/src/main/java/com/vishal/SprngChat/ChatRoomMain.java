package com.vishal.SprngChat;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChatRoomMain {

    static AbstractApplicationContext context;

    public static void main(String[] args) {

        context = new ClassPathXmlApplicationContext("chat.xml");

        printCharoom("pune");
        printCharoom("mumbai");

        context.close();
        context.registerShutdownHook();
    }

    public static void printCharoom(String name) {
        System.out.println("Chatroom : " + name);
        ChatRoom chatroom = (ChatRoom) context.getBean(name);
        System.out.println(chatroom.getUserList());
        System.out.println( chatroom.getMessageList());
        
    }

}