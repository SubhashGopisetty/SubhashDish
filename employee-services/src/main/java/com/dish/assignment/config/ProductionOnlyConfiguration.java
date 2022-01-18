package com.dish.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("prod")
public class ProductionOnlyConfiguration {


    @Bean
    public String dummy()
    {
        return "Something";
    }

}
