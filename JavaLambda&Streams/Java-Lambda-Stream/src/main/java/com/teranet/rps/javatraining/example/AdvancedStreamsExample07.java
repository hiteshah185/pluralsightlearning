package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;

public class AdvancedStreamsExample07 {
    public static void main(String[] args) {
        List<Employee> employeeList= SampleData.getEmployees();
        DoubleStream doubleStream = employeeList.stream()
                .mapToDouble(employee->employee.getYearOfExperience().doubleValue());
        System.out.println("Total Experiences:"+doubleStream.sum());

        DoubleSummaryStatistics summaryStatistics = employeeList.stream()
                .mapToDouble(employee->employee.getYearOfExperience().doubleValue())
                .summaryStatistics();
        System.out.printf("Count  : %d%n", summaryStatistics.getCount());
        System.out.printf("Sum    :  %.2f%n", summaryStatistics.getSum());
        System.out.printf("Minimum:  %.2f%n", summaryStatistics.getMin());
        System.out.printf("Maximum:  %.2f%n", summaryStatistics.getMax());
        System.out.printf("Average:  %.2f%n", summaryStatistics.getAverage());
    }
}
