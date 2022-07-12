package com.example.employesDC23.Controllers;

import com.example.employesDC23.Repositories.EmployeeRepository;
import com.example.employesDC23.entities.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    EmployeeRepository repository;
    /*@GetMapping("/employees")
    public List<Employees> getEmployees(){
        return repository.findAll();
    }
    @GetMapping("/employees/{id}")
    public Optional<Employees> getEmployeeById(@PathVariable("id") int id){
        return repository.findById(id);
    }*/
    @GetMapping("/")
    public String getEmployees(Model model){
       List<Employees> list= repository.findAll();
       model.addAttribute("myList",list);
       model.addAttribute("employee",new Employees());
        return "index";
    }
    @PostMapping("/empsave")
    public String saveEmployee(Employees employee){
        repository.save(employee);
        return "redirect:/";
    }
}
