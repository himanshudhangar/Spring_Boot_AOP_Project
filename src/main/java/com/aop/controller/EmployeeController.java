package com.aop.controller;

import com.aop.model.Employee;
import com.aop.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee ){
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee findById( @PathVariable(value = "id") Integer id ){
        return employeeService.findById(id);
    }


}