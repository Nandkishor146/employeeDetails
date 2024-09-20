package com.example.employee.employeeDetails.servicesImpl;

import com.example.employee.employeeDetails.entity.Employee;

import java.util.List;

public interface employeeImpl {
    Employee saveEmployee(Employee employee);
    List<Employee> getEmployees();
    Employee getEmployeeById(int id);
    String deleteById(int id);
    Employee updateEmployee(Employee employee);
}
