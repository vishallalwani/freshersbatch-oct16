package com.vishal.SprngChat;

public class Message {

    private Integer id;

    private String message;

    private ChatRoom chatroom;

    public Message() {
    }

    public Message(String message, ChatRoom chatroom) {
        super();
        this.message = message;
        this.chatroom = chatroom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChatRoom getChatroom() {
        return chatroom;
    }

    public void setChatroom(ChatRoom chatroom) {
        this.chatroom = chatroom;
    }

    @Override
    public String toString() {
        return "Message [id=" + id + ", message=" + message + "]";
    }
}