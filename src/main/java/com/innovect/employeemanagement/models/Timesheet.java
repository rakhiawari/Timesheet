package com.innovect.employeemanagement.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.DatabaseMetaData;
import java.util.Date;

@Entity
public class Timesheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;
    private Integer hours;
}
