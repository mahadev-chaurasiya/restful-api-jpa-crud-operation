package com.mahadev.demojpacrudoperation.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Application.
 *
 * @author MAHADEV CHAURASIYA
 */
@Setter
@Getter
@ToString
@Entity
@Table(name = "employee_tbl")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "employee_first_name", nullable = false)
    private String empFirstName;
    @Column(name = "employee_last_name", nullable = false)
    private String empLastName;
    @Column(name = "employee_designation", nullable = false)
    private String empDes;

    @Column(name = "employee_number", nullable = false)
    private String empNumber;
    @Column(name = "employee_dob", nullable = false)
    private String empDOB;
    @Column(name = "employee_email", nullable = false)
    private String empEmail;
    @Column(name = "employee_doj", nullable = false)
    private String empDOJ;
}
