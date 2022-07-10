package com.example.lab02.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.lab02.Contact;
import com.example.lab02.ContactBusiness;
import com.example.lab02.Student;
import com.example.lab02.StudentList;



@Controller
@CrossOrigin
public class MyController {

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }
    
    @RequestMapping("/list_contact")
    public String listContact(Model model) {
        ContactBusiness business = new ContactBusiness();
        List<Contact> contactList = business.getContactList();
        model.addAttribute("contacts", contactList);

        return "contact";
    }

    @RequestMapping("/list_student")
    public String listStudent(Model model) {
        StudentList student = new StudentList();
        List<Student> studentList = student.getStudentList();
        model.addAttribute("students", studentList);

        return "student";
    }

}
