package com.mahadev.demojpacrudoperation.controller;

import com.mahadev.demojpacrudoperation.model.Employee;
import com.mahadev.demojpacrudoperation.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Application.
 *
 * @author MAHADEV CHAURASIYA
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepo mEmployeeRepo;

    @PostMapping("/addEmployeeDetails")
    public Employee addEmployee(@Validated @RequestBody Employee employee) {
        return mEmployeeRepo.save(employee);
    }
    @GetMapping("/getAllEmployeeDetails")
    public List<Employee> employeeDetails(){
        return mEmployeeRepo.findAll();
    }

}
