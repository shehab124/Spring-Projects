package com.example.SecurityMyBatis.model;

public class MessageForm {

    private String username;
    private String messageText;
    private String messageType;

    public MessageForm(String username, String messageText, String messageType) {
        this.username = username;
        this.messageText = messageText;
        this.messageType = messageType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
