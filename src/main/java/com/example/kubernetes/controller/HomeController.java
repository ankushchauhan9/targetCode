package com.example.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    String message = "Welcome to the Home Page! to test cherry pick";

    public String anotherMessage = "This is another message to test cherry pick";

    @GetMapping("/")
    public String home() {
        return "Welcome to the Home Page!";
    }
}