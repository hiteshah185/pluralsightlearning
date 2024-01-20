package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Department;
import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExample05 {
    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();
        Map<Department,List<Employee>> departmentListMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        Map<Department,List<String>> employeeByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName,Collectors.toList())
                ));
        System.out.println(employeeByDepartment);
    }
}
