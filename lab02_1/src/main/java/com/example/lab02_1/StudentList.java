package com.example.lab02_1;

import java.util.ArrayList;
import java.util.List;
 
public class StudentList {
    public List<Student> getStudentList() {
        List<Student> listStudent = new ArrayList<>();
         
        listStudent.add(new Student("633020035-8","Chanon1 Pakeenuya"));
        listStudent.add(new Student("633020035-8","Chanon2 Pakeenuya"));
        listStudent.add(new Student("633020035-8","Chanon3 Pakeenuya"));
        listStudent.add(new Student("633020035-8","Chanon4 Pakeenuya"));
         
        return listStudent;
    }
}