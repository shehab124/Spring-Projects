package com.example.Spring.MVC.service;

import com.example.Spring.MVC.model.ChatForm;
import com.example.Spring.MVC.model.ChatMessage;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatListService {
    private List<ChatMessage> chatList;

    @PostConstruct
    public void postConstruct()
    {
        chatList = new ArrayList<>();
    }

    public List<ChatMessage> getChatList()
    {
        return new ArrayList<>(this.chatList);
    }

    public void addMessage(ChatForm chat)
    {
        ChatMessage newMessage = new ChatMessage();
        newMessage.setUsername(chat.getUsername());
        switch (chat.getMessageType())
        {
            case "Say":
                newMessage.setMessageText(chat.getMessageText());
                break;
            case "Shout":
                newMessage.setMessageText(chat.getMessageText().toUpperCase());
                break;
            case "Whisper":
                newMessage.setMessageText(chat.getMessageText().toLowerCase());
                break;
        }
        this.chatList.add(newMessage);
    }

}
