package com.example.Spring_Security_Basics.controller;

import com.example.Spring_Security_Basics.model.MessageForm;
import com.example.Spring_Security_Basics.service.MessageListService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    private MessageListService messageListService;

    public HomeController(MessageListService messageListService)
    {
        this.messageListService = messageListService;
    }

    @GetMapping()
    public String getHomePage(MessageForm messageForm, Model model)
    {
        model.addAttribute("greetings", this.messageListService.getMessages());
        return "home";
    }

    @PostMapping()
    public String addMessage(MessageForm messageForm, Model model)
    {
        messageListService.addMessage(messageForm.getText());
        model.addAttribute("greetings", messageListService.getMessages());
        messageForm.setText("");
        return "home";
    }
}
