package com.example.lab6;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int credit_Balance;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit_Balance() {
        return this.credit_Balance;
    }

    public void setCredit_Balance(int credit_Balance) {
        this.credit_Balance = credit_Balance;
    }
   
}