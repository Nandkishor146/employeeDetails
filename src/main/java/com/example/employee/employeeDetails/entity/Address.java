package com.example.employee.employeeDetails.entity;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addId;
    private String city;
    private String addType;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empId",referencedColumnName = "empId")
    private Employee employee;
    public Address() {
    }


    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addId=" + addId +
                ", city='" + city + '\'' +
                ", addType='" + addType + '\'' +
                ", employee=" + employee +
                '}';
    }
}
