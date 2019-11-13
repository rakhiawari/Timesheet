package com.innovect.employeemanagement.controller;


import com.innovect.employeemanagement.models.Project;
import com.innovect.employeemanagement.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @RequestMapping("addProject")
    public void addProject(@RequestBody Project project){
        projectService.addProject(project);
    }
    @RequestMapping("/getProject")
    public Iterable<Project> getProject(){
       return projectService.getProject();
    }
}
