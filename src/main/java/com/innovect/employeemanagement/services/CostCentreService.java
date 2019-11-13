package com.innovect.employeemanagement.services;

import com.innovect.employeemanagement.models.CostCentre;
import com.innovect.employeemanagement.repository.CostCentreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostCentreService {

    @Autowired
    CostCentreRepository costCentreRepository;

    public Iterable<CostCentre> getCostCentre() {
        return costCentreRepository.findAll();
    }

    public void addCostCentre(CostCentre costCentre) {
        costCentreRepository.save(costCentre);
    }
}
