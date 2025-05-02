package com.hubspot.integration.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hubspot")
public class AuthenticationController {

    @GetMapping("/")
    public String home() {
        return "Welcome !!!";
    }

    @GetMapping("/login")
    public String goToLoginPage() {
        return "Hello Friend!";
    }
}
