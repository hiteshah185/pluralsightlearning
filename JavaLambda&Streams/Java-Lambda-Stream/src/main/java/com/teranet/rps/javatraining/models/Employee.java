package com.teranet.rps.javatraining.models;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final String email;
    private final Department department;
    private final BigDecimal yearOfExperience;

    public Employee(String name, String email, Department department, BigDecimal yearOfExperience) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.yearOfExperience = yearOfExperience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Department getDepartment() {
        return department;
    }

    public BigDecimal getYearOfExperience() {
        return yearOfExperience;
    }
}
