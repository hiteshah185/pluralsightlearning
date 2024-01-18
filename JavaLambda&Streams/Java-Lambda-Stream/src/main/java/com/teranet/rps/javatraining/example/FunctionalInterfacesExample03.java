package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfacesExample03 {
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
        String name = "Isabella";
        Function<Employee, BigDecimal> employeeYearOfExperienceFunction = Employee::getYearOfExperience;
        Function<BigDecimal,String> YearOfExperienceStringFunction = yearOfExperience -> String.format("%s have %.2f years of experience.",name,yearOfExperience);

        Function<Employee,String> employeeStringFunction = employeeYearOfExperienceFunction.andThen(YearOfExperienceStringFunction);

        findEmployee(employeeList,employee -> employee.getName().equals(name))
                .map(employeeStringFunction)
                .ifPresentOrElse(
                        System.out::println,
                        ()->System.out.printf("%s is not available in the list.%n",name)
                );
    }

}
