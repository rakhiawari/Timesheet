package com.innovect.employeemanagement.controller;

import com.innovect.employeemanagement.models.Employee;
import com.innovect.employeemanagement.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getEmployees")
    public Iterable<Employee> getEmployee(){
        return employeeService.getEmployee();
    }

    @RequestMapping("/addEmployee")
    public void addEmployee(Employee employee){
        employeeService.addEmployee(employee);
    }
}
