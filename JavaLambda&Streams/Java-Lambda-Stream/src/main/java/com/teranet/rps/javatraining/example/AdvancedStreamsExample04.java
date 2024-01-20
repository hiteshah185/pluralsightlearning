package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Department;
import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExample04 {
    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();
        Map<Department, BigDecimal> departmentIntegerMap=employeeList.stream()
                .collect(
                        Collectors.toMap(
                                Employee::getDepartment,
                                Employee::getYearOfExperience,
                                BigDecimal::add
                        )
                );
        System.out.println(departmentIntegerMap);

    }
}
