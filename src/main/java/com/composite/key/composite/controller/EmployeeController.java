package com.composite.key.composite.controller;

import com.composite.key.composite.entity.Employee;
import com.composite.key.composite.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping
    public Employee save(@RequestBody Employee employee){
       return employeeRepo.save(employee);
    }
    @GetMapping
    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }
}
