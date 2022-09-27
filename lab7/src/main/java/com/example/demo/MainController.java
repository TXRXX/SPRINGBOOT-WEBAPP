package com.example.demo;
 
import java.util.*;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.lang.String;
@Controller
public class MainController {
  @Autowired
  private EmployeeRepository EmployeeRepository;
@RequestMapping("/")
  public String EmployeeForm(Model model) {
   
	  List<Employee> employee = (List<Employee>) EmployeeRepository.findAll();
	  model.addAttribute("employee",employee);
    return "index";
  }
  @GetMapping("/delete/{id}")
  public String deleteEmployee(@PathVariable("id") long id, Model model) {
      Employee Employee = EmployeeRepository.findById((int) id)
        .orElseThrow(() -> new IllegalArgumentException("Invalid Employee Id:" + id));
      EmployeeRepository.delete(Employee);
      return "redirect:/";
  }
  @PostMapping("/update/{id}")
  public String updateEmployee(@PathVariable("id") Integer id, @Validated  Employee Employee, 
    BindingResult result, Model model) {
     System.out.println(id); 
//	 System.out.println(Employee.getId()+ Employee.getName());
	if (result.hasErrors()) {
          Employee.setId(id);
          return "update-Employee";
      }
          
      EmployeeRepository.save(Employee);
      return "redirect:/";
  }
  @GetMapping("/edit/{id}")
  public String showUpdateForm(@PathVariable("id") int id, Model model) {
      Employee Employee = EmployeeRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Invalid Employee Id:" + id));
      
      model.addAttribute("Employee", Employee);
      return "update-Employee";
  }
   
  @GetMapping(path="/all")
  public @ResponseBody Iterable<Employee> getAllemployee() {
    // This returns a JSON or XML with the employee
    return EmployeeRepository.findAll();
  }
  
  @PostMapping("/register")
  public String addEmployee(@Validated Employee Employee, BindingResult result, Model model) {
      if (result.hasErrors()) {
          return "EmployeeForm";
      }
      
      EmployeeRepository.save(Employee);
      return "redirect:/";
  }
  @GetMapping("/register")
  public String showForm(Model model) {
      Employee Employee = new Employee();
      model.addAttribute("Employee", Employee);
      
      return "EmployeeForm";
  }
 
}