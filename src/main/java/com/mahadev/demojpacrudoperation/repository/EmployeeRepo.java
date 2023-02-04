package com.mahadev.demojpacrudoperation.repository;

import com.mahadev.demojpacrudoperation.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
