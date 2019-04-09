package com.knoldus.demo.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
    
    public String welcomeMessage() {
        return "Hello Everyone, Welcome to this service";
    }
}
