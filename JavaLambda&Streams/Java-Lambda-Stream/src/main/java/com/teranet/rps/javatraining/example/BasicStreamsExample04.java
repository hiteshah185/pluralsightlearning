package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Department;
import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class BasicStreamsExample04 {
    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();

        Optional<Employee> opt1 = employeeList.stream()
                .filter(ep->ep.getDepartment()== Department.RPS)
                .findFirst();

        Optional <Employee> opt2  = employeeList.stream()
                        .filter(ep->ep.getDepartment()==Department.RPS)
                                .findAny();

        boolean hasRPSEmployees = employeeList.stream()
                                .anyMatch(ep->ep.getDepartment()==Department.RPS);

        BigDecimal experienceLimit = new BigDecimal("1");
        boolean hasExperiencedEmployee = employeeList.stream()
                        .allMatch(ep->ep.getYearOfExperience().compareTo(experienceLimit)<0);

        BigDecimal highlyExperienceLimit = new BigDecimal("10");
        boolean highlyExperiencedEmployee = employeeList.stream()
                        .noneMatch(ep->ep.getYearOfExperience().compareTo(highlyExperienceLimit)<0);

        System.out.println("Find first result:"+opt1);
        System.out.println("Find first any:"+opt2);
        System.out.println("hasRPSEmployee:"+hasRPSEmployees);
        System.out.println("hasExperiencedRPSEmployee:"+hasExperiencedEmployee);
        System.out.println("highlyExperiencedEmployee:"+highlyExperiencedEmployee);




    }
}
