package com.example.gorai.technology.solution.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The `Customer` class represents the customer entity stored in MongoDB.
 * It contains various fields associated with a customer and provides
 * getter and setter methods for each of these fields.
 */
@Document
public class Customer {

    @Id
    private String id; // The unique identifier for the customer in the database

    private String employeeName; // Name of the employee
    private String role; // Role or job title of the employee
    private String startDate; // Start date of employment
    private String endDate; // End date of employment (if applicable)
    private Double salary; // Salary of the employee
    private String term; // Contract term or duration
    private String otherDetail; // Other relevant details about the employee
    private String department; // Department in which the employee works
    private String manager; // Manager or supervisor of the employee

    // Default Constructor
    public Customer() {
    }

    // Parameterized Constructor to initialize all fields
    public Customer(String id, String employeeName, String role, String startDate, String endDate, Double salary,
                    String term, String otherDetail, String department, String manager) {
        this.id = id;
        this.employeeName = employeeName;
        this.role = role;
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
        this.term = term;
        this.otherDetail = otherDetail;
        this.department = department;
        this.manager = manager;
    }

    // Getters and Setters for each property
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getOtherDetail() {
        return otherDetail;
    }

    public void setOtherDetail(String otherDetail) {
        this.otherDetail = otherDetail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
