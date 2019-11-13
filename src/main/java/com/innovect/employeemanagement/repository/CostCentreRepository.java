package com.innovect.employeemanagement.repository;


import com.innovect.employeemanagement.models.CostCentre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostCentreRepository extends CrudRepository<CostCentre,Integer> {
}
