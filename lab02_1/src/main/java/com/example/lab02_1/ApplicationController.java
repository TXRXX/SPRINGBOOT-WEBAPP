package com.example.lab02_1;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ApplicationController {

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
