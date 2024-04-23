package com.example.Spring.MVC.controller;


import com.example.Spring.MVC.model.MessageForm;
import com.example.Spring.MVC.service.MessageListService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;

@Controller
public class HomeController {

    private MessageListService messageListService;

    public HomeController(MessageListService messageListService)
    {
        this.messageListService = messageListService;
    }

    @GetMapping("/home")
    public String getHomePage(@ModelAttribute("messageForm") MessageForm messageForm, Model model)
    {
        model.addAttribute("greeting", this.messageListService.getMessages());
        return "home";
    }
    @PostMapping("/animal")
    public String addMessage(@ModelAttribute("messageForm") MessageForm messageForm, Model model)
    {
        messageListService.setMessage(messageForm.getAnimalName() + " is " + messageForm.getAdjective());
        model.addAttribute("greeting", messageListService.getMessages());
        messageForm.setAdjective("");
        messageForm.setAnimalName("");
        return "home";
    }
}
