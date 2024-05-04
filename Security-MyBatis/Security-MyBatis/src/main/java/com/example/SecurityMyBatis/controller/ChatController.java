package com.example.SecurityMyBatis.controller;

import com.example.SecurityMyBatis.model.ChatMessage;
import com.example.SecurityMyBatis.model.MessageForm;
import com.example.SecurityMyBatis.service.MessageListService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {
    private final MessageListService messageListService;

    public ChatController(MessageListService messageListService)
    {
        this.messageListService = messageListService;
    }

    @GetMapping()
    public String getHomePage(MessageForm messageForm, Model model)
    {
        model.addAttribute("greetings", this.messageListService.getMessages());
        return "chat";
    }

    @PostMapping()
    public String addMessage(MessageForm messageForm, Model model)
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String txt = messageForm.getMessageText();
        System.out.println(txt);
        System.out.println(auth.getName());
        messageListService.addMessage(new ChatMessage(null, auth.getName(), messageForm.getMessageText()));
        model.addAttribute("greetings", messageListService.getMessages());
        messageForm.setMessageText("");
        return "chat";
    }
}
