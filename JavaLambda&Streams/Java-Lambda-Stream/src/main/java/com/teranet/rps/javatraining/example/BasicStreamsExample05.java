package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Department;
import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamsExample05 {
    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();

        List<String> itBuddies = employeeList.stream()
                .filter(ep->ep.getDepartment()== Department.IT)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("IT Buddies are:"+itBuddies);

        String departments = employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .map(Department::name)
                .collect(Collectors.joining(","));
        System.out.println("Departments:"+departments);
    }
}
