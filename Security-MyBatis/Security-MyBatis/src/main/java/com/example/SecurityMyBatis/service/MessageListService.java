package com.example.SecurityMyBatis.service;

import com.example.SecurityMyBatis.mapper.MessageMapper;
import com.example.SecurityMyBatis.model.ChatMessage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageListService {
    private MessageMapper messageMapper;

    public MessageListService(MessageMapper messageMapper)
    {
        this.messageMapper = messageMapper;
    }

    public void addMessage(ChatMessage message) {
        messageMapper.insert(message);
    }

    public List<ChatMessage> getMessages() {
        return messageMapper.getMessages();
    }

}
