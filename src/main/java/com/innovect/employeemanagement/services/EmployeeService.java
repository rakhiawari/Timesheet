package com.innovect.employeemanagement.services;

import com.innovect.employeemanagement.models.Employee;
import com.innovect.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Iterable<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

}
