package com.innovect.employeemanagement.repository;


import com.innovect.employeemanagement.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
