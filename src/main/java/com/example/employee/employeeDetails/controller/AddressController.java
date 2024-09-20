package com.example.employee.employeeDetails.controller;


import com.example.employee.employeeDetails.entity.Address;
import com.example.employee.employeeDetails.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService service;

    @PostMapping("/addAddresses")
    public ResponseEntity<String> addAddress(@RequestBody Address address){
        service.saveAddresses(address);
        return ResponseEntity.ok("Address Saved");
    }
    @GetMapping("getByID/{id}")
    public  Address findById(@PathVariable int id)
    {
        return service.getAddressById(id);
    }
    @PutMapping("/updateAddress")
    public Address updateAddress(@RequestBody Address address)
    {
        return service.updateAddress(address);
    }
    @DeleteMapping("/deleteAddress/{id}")
    public String deleteAddress(@PathVariable int id)
    {
        return service.deleteById(id);
    }
}
