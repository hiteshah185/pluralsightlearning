package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FunctionalInterfacesExample01 {
    static Optional<Employee> findEmployee(List<Employee> employees, Predicate<Employee> predicate){
        for(Employee employee:employees){
            if(predicate.test(employee)){
                return Optional.of(employee);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<Employee> employeesList = SampleData.getEmployees();
        String name = "Sonia";
        findEmployee(employeesList,employee -> employee.getName().equals(name))
                .map(Employee::getDepartment)
                .ifPresentOrElse(
                        department -> System.out.printf("%s works at %s.",name,department),
                        ()-> System.out.printf("%s is not available.",name)
                );
    }

}
