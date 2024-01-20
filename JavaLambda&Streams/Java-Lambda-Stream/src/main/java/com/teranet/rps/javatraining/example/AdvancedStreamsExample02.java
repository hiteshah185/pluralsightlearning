package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class AdvancedStreamsExample02 {
    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();

        Optional<BigDecimal> opt = employeeList.stream()
                .map(Employee::getYearOfExperience)
                .reduce((result,element)->result.add(element));
        opt.ifPresentOrElse(
                total->System.out.printf("Total work-experience is %.2f%n",total),
                ()->System.out.println("No such employee.")
        );

        BigDecimal total = employeeList.stream()
                .map(Employee::getYearOfExperience)
                .reduce(BigDecimal.ZERO,BigDecimal::add);
        System.out.printf("The total experience of all employee is:  %.2f%n", total);

    }
}
