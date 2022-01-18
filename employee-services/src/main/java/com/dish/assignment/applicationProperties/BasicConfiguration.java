package com.dish.assignment.applicationProperties;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("basic")
public class BasicConfiguration {

    @Setter private boolean value;
    @Setter private String message;
    @Setter private int number;

    public boolean isValue()
    {return value;}

    public String getMesssage()
    {return message;}


    public int getNumber()
    {
        return number;
    }
}
