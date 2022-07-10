package com.example.lab02_1;

public class Contact {
    private String name;
    private String email;
    private String country;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
 
    public Contact() {
        super();
    }
    
    public Contact(String name, String email, String country) {
        super();
        this.name = name;
        this.email = email;
        this.country = country;
    }
 
    
}
