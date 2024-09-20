package com.example.employee.employeeDetails.service;

import com.example.employee.employeeDetails.entity.Address;
import com.example.employee.employeeDetails.entity.Employee;
import com.example.employee.employeeDetails.repository.addressRepo;
import com.example.employee.employeeDetails.repository.employeeRepo;
import com.example.employee.employeeDetails.servicesImpl.addressImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService implements addressImpl {

 //private Employee employee;

    @Autowired
    private addressRepo repo;
    @Autowired
private employeeRepo repo1;
@Override
public void saveAddresses(Address address) {
    Optional<Employee> existemp=repo1.findByEmpId(address.getEmployee().getEmpId());
    if(existemp.isPresent()) {
        Employee existEmp = existemp.get();
        address.setEmployee(existEmp);
        repo.save(address);
    } else {
        throw new RuntimeException("Employee Not Present");
    }
}


    @Override
    public Address getAddressById(int id) {
        return repo.getById(id);
    }

    @Override
    public String deleteById(int id)
    {
        repo.deleteById(id);
        return "Address Deleted";
    }

    @Override
    public Address updateAddress(Address address) {
        Address previous=repo.findById(address.getAddId()).orElse(null);
        previous.setCity(address.getCity());
        previous.setAddType(address.getAddType());
       return repo.save(previous);
    }


}
