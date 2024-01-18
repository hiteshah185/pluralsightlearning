package com.teranet.rps.javatraining.exercises;

import com.teranet.rps.javatraining.models.Employee;

import java.util.List;

public class LambdaExercise01 {
    public void sortEmployeesByName(List<Employee> employeeList){
        employeeList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
    }
    public void sortEmployeeByDepartment(List<Employee> employeeList){
        employeeList.sort((e1,e2)->
            e2.getDepartment().compareTo(e2.getDepartment())
        );
    }
    public void sortEmployeeByYearOfExperience(List<Employee> employeeList){
        employeeList.sort((e1,e2)->e1.getYearOfExperience().compareTo(e2.getYearOfExperience()));
    }

}
