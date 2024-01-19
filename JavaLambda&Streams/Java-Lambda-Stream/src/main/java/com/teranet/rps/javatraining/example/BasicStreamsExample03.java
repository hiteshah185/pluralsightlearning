package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Department;
import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.util.List;
import java.util.stream.Stream;

public class BasicStreamsExample03 {
    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();
        employeeList.stream()
                .filter(ep->ep.getDepartment()== Department.LEGAL)
                .forEach(filEp->System.out.println(filEp.getName()+" - "+filEp.getDepartment()));

        employeeList.stream()
                .map(ep->String.format("%s is with %s for %2f years.",ep.getName(),ep.getDepartment(),ep.getYearOfExperience()))
                .forEach(System.out::println);

        employeeList.stream()
                .flatMap(ep-> Stream.of(ep.getEmail()))
                .forEach(System.out::println);
    }
}
