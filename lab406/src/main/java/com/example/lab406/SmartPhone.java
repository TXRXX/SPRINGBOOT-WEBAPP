package com.example.lab406;

import org.springframework.stereotype.Component;

@Component
public class SmartPhone implements Device {

    @Override
    public String display() {
        return "SmartPhone";
    }

}