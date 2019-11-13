package com.innovect.employeemanagement.services;


import com.innovect.employeemanagement.models.Project;
import com.innovect.employeemanagement.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public Iterable<Project> getProject() {
        return projectRepository.findAll();
    }

    public void addProject(Project project) {
        projectRepository.save(project);
    }
}
