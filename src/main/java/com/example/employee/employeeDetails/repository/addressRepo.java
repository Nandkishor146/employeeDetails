package com.example.employee.employeeDetails.repository;

import com.example.employee.employeeDetails.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface addressRepo extends JpaRepository<Address,Integer> {
}
