package com.example.Spring.MVC.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageListService {
    private List<String> messages;

    @PostConstruct
    public void postConstruct()
    {
        this.messages = new ArrayList<>();
    }

    public List<String> getMessages() {
        return new ArrayList<>(this.messages);
    }

    public void setMessage(String messages) {
        this.messages.add(messages);
    }
}
