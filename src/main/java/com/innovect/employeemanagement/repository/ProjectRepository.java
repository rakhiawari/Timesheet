package com.innovect.employeemanagement.repository;

import com.innovect.employeemanagement.models.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Integer> {
}
