package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample02 {
    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();
        BigDecimal yearOfExperienceLimit = new BigDecimal("2");
        printEmployee(employeeList,yearOfExperienceLimit);
        System.out.println();
        employeeList.forEach(employee -> {
            if(employee.getYearOfExperience().compareTo(yearOfExperienceLimit)<0){
                System.out.println(employee.getName());
            }
        });
        System.out.println();
        var filterEmployees = employeeList.stream()
                .filter(employee -> employee.getYearOfExperience().compareTo(yearOfExperienceLimit)<0)
                .collect(Collectors.toList());
        for(Employee employee:filterEmployees){
            System.out.println(employee.getName());
        }
        System.out.println();
        employeeList.parallelStream()
                .forEach(employee -> {
                    if(employee.getYearOfExperience().compareTo(yearOfExperienceLimit)<0){
                        System.out.println(employee.getName());
                    }
                });

    }
    public static void printEmployee(List<Employee> employees, BigDecimal yearOfExperience){
        for(Employee employee: employees){
            if(employee.getYearOfExperience().compareTo(yearOfExperience)<0){
                System.out.println(employee.getName());
            }
        }
    }
}
