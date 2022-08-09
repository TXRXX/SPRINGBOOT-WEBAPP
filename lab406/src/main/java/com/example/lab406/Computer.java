package com.example.lab406;

import org.springframework.stereotype.Component;

@Component
public class Computer implements Device {

    @Override
    public String display() {
        return "Computer";
    }

}