package com.microservice.it.controller;

import com.microservice.it.entity.Employee;
import com.microservice.it.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/consumer/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id")Long id){
        return employeeService.getEmployeeById(id);
    }

}
