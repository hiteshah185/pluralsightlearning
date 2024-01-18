package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Department;
import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FunctionalInterfacesExample04 {
    static Optional<Employee> findEmployee(List<Employee> employees, Predicate<Employee> predicate){
        for(Employee employee:employees){
            if(predicate.test(employee)){
                return Optional.of(employee);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();
        BigDecimal sampleYearOfExperienceLimit= new BigDecimal("10");
        Predicate<Employee> isRPS = ep -> ep.getDepartment() == Department.RPS;
        Predicate<Employee> isExperienced = employee -> employee.getYearOfExperience().compareTo(sampleYearOfExperienceLimit)<0;

        findEmployee(employeeList,isRPS.and(isExperienced))
                .map(employee -> String.format("%s has experience of %f years.",employee.getName(),employee.getYearOfExperience()))
                .ifPresentOrElse(
                        System.out::println,
                        ()->System.out.printf("There is no employee within RPS with %f experiences.",sampleYearOfExperienceLimit)
                );

    }
}
