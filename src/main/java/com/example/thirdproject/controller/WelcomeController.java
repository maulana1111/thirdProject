package com.example.thirdproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
    @Autowired(required = true)
    @GetMapping("/")
    public String welcome() {
        return "Welcome";
    }
}
