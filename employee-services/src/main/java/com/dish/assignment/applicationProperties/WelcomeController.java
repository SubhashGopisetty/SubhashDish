package com.dish.assignment.applicationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @Autowired
    BasicConfiguration basicConfiguration;

    @GetMapping(value = "/welcome")
    public String welcome()
    {
        return welcomeService.retriveWelcomeMessage();
    }

    @GetMapping(value = "/welcome",headers = "Foo")
    public String welcome1()
    {
        return "Static message";
    }

    @GetMapping("/dynamic-configuration")
    public Map<String,Object> dynamicConfiguration()
    {
        Map<String,Object> map = new HashMap<>();
        map.put("value",basicConfiguration.isValue());
        map.put("message",basicConfiguration.getMesssage());
        map.put("number",basicConfiguration.getNumber());

        return map;
    }

}
