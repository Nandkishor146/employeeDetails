package com.example.employee.employeeDetails.controller;

import com.example.employee.employeeDetails.entity.Employee;
import com.example.employee.employeeDetails.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @PostMapping("/addEmp")
    public Employee addEmployye(@RequestBody Employee employee)
    {
        return service.saveEmployee(employee);
    }
    @GetMapping("/getAllEmp")
    public List<Employee> findEmployees()
    {
        return service.getEmployees();
    }
    @GetMapping("/getById/{id}")
 public Employee findById(@PathVariable int id)
 {
     return service.getEmployeeById(id);
 }
 @DeleteMapping("/deleteById/{id}")
public String deleteById(@PathVariable int id)
{
    service.deleteById(id);
    return "Employee Deleted";
}
@PutMapping("/updateEmployee")
public Employee updateEmployee(@RequestBody Employee employee)
{
    return service.updateEmployee(employee);
}
}
