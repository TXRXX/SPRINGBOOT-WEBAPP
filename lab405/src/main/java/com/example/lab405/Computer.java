package com.example.lab405;

public class Computer implements Device {
    private String say;
        @Override
        public String display() {
            return say;
        }
        public String getSay() {
            return say;
        }
        public void setSay(String say) {
            this.say = say;
        }
    
    }