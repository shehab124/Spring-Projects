package com.example.SecurityMyBatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/x")
public class XController {
    @GetMapping()
    public String getX()
    {
        return "x";
    }


}
