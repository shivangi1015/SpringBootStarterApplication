package com.knoldus.demo.controller;

import com.knoldus.demo.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
    @Autowired
    private WelcomeService welcomeService;
    
    @RequestMapping("/welcome")
    public String welcome() {
        return welcomeService.welcomeMessage();
    }
    
}
