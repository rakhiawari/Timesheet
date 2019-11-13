package com.innovect.employeemanagement.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer projectId;

    @Column(name = "project_name", nullable = false)
    private String projectName;

    @Column(name = "manager_id", nullable = false)
    private String managerId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cost_centre_id")
    private CostCentre costCentre;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "projects")
    private Set<Employee> employees;

    public Project() {
    }

    public Project(String projectName, String managerId) {
        this.projectName = projectName;
        this.managerId = managerId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }


}
