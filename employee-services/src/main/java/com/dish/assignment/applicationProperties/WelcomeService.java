package com.dish.assignment.applicationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Size;

@Component
public class WelcomeService {

    @Size(min=2)
    @Value("${welcome.message}")
    private String welcomeMessage;

    public String retriveWelcomeMessage(){
        return welcomeMessage;
    }
}
