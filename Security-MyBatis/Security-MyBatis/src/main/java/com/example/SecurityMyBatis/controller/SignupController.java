package com.example.SecurityMyBatis.controller;

import com.example.SecurityMyBatis.model.SignupForm;
import com.example.SecurityMyBatis.model.User;
import com.example.SecurityMyBatis.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignupController {

    private UserService userService;

    public SignupController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping()
    public String getRoot(SignupForm signupForm, Model model)
    {
        return "signup";
    }

    @PostMapping()
    public String createUser(SignupForm signupForm, Model model)
    {
        User user = new User(null, signupForm.getUsername(), null, signupForm.getPassword(), signupForm.getFirstName(), signupForm.getLastName());
        userService.createUser(user);

       User user2 = userService.getUser(signupForm.getUsername());
        System.out.println(user2.toString());
        return "signup";
    }

}
