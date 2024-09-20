package com.example.employee.employeeDetails.service;
import com.example.employee.employeeDetails.entity.Employee;
import com.example.employee.employeeDetails.repository.employeeRepo;
import com.example.employee.employeeDetails.servicesImpl.employeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
@Service
public class EmployeeService implements employeeImpl {
    @Autowired
    private employeeRepo repo;
    @Override
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String deleteById(int id) {
        try {
            repo.deleteById(id);
            return "Employee Deleted";
        } catch (EmptyResultDataAccessException e) {
            return "Employee not found";
        } catch (Exception e) {
            return "An error occurred while deleting the employee";
        }
       /* repo.deleteById(id);
        return "Employee Deleted";*/
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee previous =repo.findById(employee.getEmpId()).orElse(null);
        previous.setEmpName(employee.getEmpName());
        previous.setEmpName(employee.getEmpName());
        return repo.save(previous);

    }
}
