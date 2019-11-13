package com.innovect.employeemanagement.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "manager_id")
    private Integer managerId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_projects", joinColumns = {@JoinColumn(name = "employee_id")}, inverseJoinColumns =
            {@JoinColumn(name = "project_id")})
    private Set<Project> projects;

    public Employee(){}
    public Employee(String name, Double salary, Integer managerId) {
        this.name = name;
        this.salary = salary;
        this.managerId = managerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}
