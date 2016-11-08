package com.vishal.SprngChat;

public class User {

    private Integer id;

    private String username;

    private String password;

    private ChatRoom chatroom;

    public User() {
    }

    public User(String username, String password, ChatRoom chatroom) {
        super();
        this.username = username;
        this.password = password;
        this.chatroom = chatroom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ChatRoom getChatroom() {
        return chatroom;
    }

    public void setChatroom(ChatRoom chatroom) {
        this.chatroom = chatroom;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password="
                + password + "]";
    }

}