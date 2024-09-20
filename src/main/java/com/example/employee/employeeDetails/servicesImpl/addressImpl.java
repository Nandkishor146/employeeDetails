package com.example.employee.employeeDetails.servicesImpl;

import com.example.employee.employeeDetails.entity.Address;
import com.example.employee.employeeDetails.entity.Employee;

import java.util.List;

public interface addressImpl {
    void saveAddresses(Address address);
    Address getAddressById(int id);
    String deleteById(int id);
    Address updateAddress(Address address);

}
