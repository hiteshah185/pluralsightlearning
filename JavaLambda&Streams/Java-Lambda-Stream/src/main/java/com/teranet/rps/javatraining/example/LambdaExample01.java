package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.util.Comparator;
import java.util.List;

public class LambdaExample01 {
    public static void main(String[] args) {
        List<Employee> mockData = SampleData.getEmployees();
        mockData.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getYearOfExperience().compareTo(o2.getYearOfExperience());
            }
        });
        mockData.sort((e1,e2)->e1.getYearOfExperience().compareTo(e2.getYearOfExperience()));
    }
}
