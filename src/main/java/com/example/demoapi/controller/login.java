package com.example.demoapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class login {
    @GetMapping("/login")
    public String getUiLogin() {
        return "login";
    }

    @GetMapping("/home")
    public String getUiHome() {
        return "home";
    }
}
