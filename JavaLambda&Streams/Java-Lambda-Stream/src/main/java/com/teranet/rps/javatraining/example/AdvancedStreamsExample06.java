package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExample06 {
    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();
        BigDecimal experienceLimit = new BigDecimal("3");
        Map<Boolean,List<Employee>> partitionedEmployees = employeeList.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getYearOfExperience().compareTo(experienceLimit)<0));
        System.out.println(partitionedEmployees.get(true));
        System.out.println(partitionedEmployees.get(false));

    }
}
