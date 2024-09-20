package com.example.employee.employeeDetails.repository;

import com.example.employee.employeeDetails.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface employeeRepo extends JpaRepository<Employee,Integer> {
  Optional<Employee> findByEmpId(int empId);
}
