package com.mahadev.demojpacrudoperation.controller;

import com.mahadev.demojpacrudoperation.exception.ResourceNotFoundException;
import com.mahadev.demojpacrudoperation.model.Employee;
import com.mahadev.demojpacrudoperation.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<Employee> employeeDetails() {
        return mEmployeeRepo.findAll();
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Employee employee = mEmployeeRepo
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee Id " + id + " is not found"));
        return ResponseEntity.ok().body(employee);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long id,
                                                   @Validated @RequestBody Employee emp)
            throws ResourceNotFoundException {
        Employee employee1 = mEmployeeRepo
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee record " + id + " is not found"));
        employee1.setEmpFirstName(emp.getEmpFirstName());
        employee1.setEmpLastName(emp.getEmpLastName());
        employee1.setEmpDes(emp.getEmpDes());
        employee1.setEmpNumber(emp.getEmpNumber());
        employee1.setEmpDOB(emp.getEmpDOB());
        employee1.setEmpEmail(emp.getEmpEmail());
        employee1.setEmpDOJ(emp.getEmpDOJ());
        final Employee updatedEmployee = mEmployeeRepo.save(employee1);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/employee/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long empId)
            throws ResourceNotFoundException {
        Employee employee = mEmployeeRepo.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee ID " + empId + " Not Found"));
        mEmployeeRepo.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
