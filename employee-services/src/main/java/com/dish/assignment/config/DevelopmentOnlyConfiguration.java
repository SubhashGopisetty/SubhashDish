package com.dish.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

//here we define the Beans that are active in the development Environment
@Profile("dev")
public class DevelopmentOnlyConfiguration {

    @Bean
    public String dummy()
    {
        return "Something";
    }
}
