package com.spring.test.SpringBootTest.model;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"responseCode","name","id","address"})
public class User {

    private String name;
    private int empId;
    private String address;

    public User(String name, int empId, String address, ResponseCode responseCode) {
        this.responseCode = responseCode;
        this.name = name;
        this.empId = empId;
        this.address = address;

    }

    private ResponseCode responseCode;

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
