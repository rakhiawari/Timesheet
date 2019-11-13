package com.innovect.employeemanagement.controller;


import com.innovect.employeemanagement.models.CostCentre;
import com.innovect.employeemanagement.services.CostCentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/costcentre")
public class CostCentreController {

    @Autowired
    CostCentreService costCentreService;

    @RequestMapping("/addCostCentre")
    public void addCostCentre(@RequestBody CostCentre costCentre){
        costCentreService.addCostCentre(costCentre);
    }
    @RequestMapping("/getCostCentre")
    public Iterable<CostCentre> getCostCentre(){
        return costCentreService.getCostCentre();
    }
}
