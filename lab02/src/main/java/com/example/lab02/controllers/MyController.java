package com.example.lab02.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab02.Contact;
import com.example.lab02.ContactBusiness;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@CrossOrigin
public class MyController {

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }
    

    // @RequestMapping("/")
    // public String index() {
    //     return "index";
    // }

    @RequestMapping("/list_contact")
    public String listContact(Model model) {
        ContactBusiness business = new ContactBusiness();
        List<Contact> contactList = business.getContactList();
        model.addAttribute("contacts", contactList);

        return "contact";
    }

}