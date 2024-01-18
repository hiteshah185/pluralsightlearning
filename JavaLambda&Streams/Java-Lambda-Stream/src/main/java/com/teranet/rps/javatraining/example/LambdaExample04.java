package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Department;
import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.math.BigDecimal;
import java.util.List;

public class LambdaExample04 {
    interface EmployeeFactory{
        Employee create(Department department, String name, BigDecimal yearOfExperience);
    }
    private static boolean isExperienced(Employee employee){
        return employee.getYearOfExperience().compareTo(new BigDecimal("5"))>=0;
    }
    private static boolean isExperienced(Employee employee, BigDecimal bigDecimal){
        return employee.getYearOfExperience().compareTo(bigDecimal)>=0;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();
        printNameFromEmployeeList(employeeList);
        System.out.println("<--------------------->");
        printInExperiencedEmployee(employeeList);
    }
    private static void printInExperiencedEmployee(List<Employee> employeeList){
        employeeList.removeIf(LambdaExample04::isExperienced);
        employeeList.forEach(
                inExperiencedEmployee->System.out.println(inExperiencedEmployee.getName()));
    }
    private static void printNameFromEmployeeList(List<Employee> employeeList){
        employeeList.stream()
                .map(e->e.getName()).forEach(
                        System.out::println
                );
    }


}
