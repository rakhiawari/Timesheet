package com.innovect.employeemanagement.models;

import javax.persistence.*;

@Entity
//@Table(name = "cost_centre")
public class CostCentre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "total_cost")
    private Double totalCost;

    @Column(name = "paying_type")
    private String type;

    @Column(name = "region")
    private String region;

    @OneToOne(mappedBy = "costCentre")
    private Project project;

    public CostCentre(){}

    public CostCentre(Double totalCost, String type, String region) {
        this.totalCost = totalCost;
        this.type = type;
        this.region = region;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
