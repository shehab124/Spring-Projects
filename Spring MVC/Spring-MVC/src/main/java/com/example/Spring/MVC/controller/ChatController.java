package com.example.Spring.MVC.controller;

import com.example.Spring.MVC.model.ChatForm;
import com.example.Spring.MVC.service.ChatListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {

    private ChatListService chatListService;

    public ChatController(ChatListService chatListService)
    {
        this.chatListService = chatListService;
    }

    @GetMapping
    public String getChatPage(ChatForm chatForm, Model model)
    {
        model.addAttribute("chatMessages", this.chatListService.getChatList());
        return "chat";
    }

    @PostMapping
    public String postChat(ChatForm chatForm, Model model)
    {
        this.chatListService.addMessage(chatForm);
        chatForm.setMessageText("");
        model.addAttribute("chatMessages", this.chatListService.getChatList());
        return "chat";
    }

    @ModelAttribute("messageTypes")
    public String[] allMessageTypes() {return new String[] {"Say", "Shout", "Whisper"};}

}
