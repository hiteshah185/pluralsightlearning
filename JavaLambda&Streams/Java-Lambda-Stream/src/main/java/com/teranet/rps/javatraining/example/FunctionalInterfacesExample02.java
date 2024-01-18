package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Department;
import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterfacesExample02 {
    public static void main(String[] args) {
        List<Employee> employees = SampleData.getEmployees();
        Map<Department,List<Employee>> EmployeeByDepartment = new HashMap<>();
        for(Employee employee:employees){
            Department department = employee.getDepartment();
            if(!EmployeeByDepartment.containsKey(department)){
                EmployeeByDepartment.put(department,new ArrayList<>());
            }
            EmployeeByDepartment.get(department).add(employee);
        }
        for(Employee employee:employees){
            Department department = employee.getDepartment();
            EmployeeByDepartment.computeIfAbsent(department,dep->new ArrayList<>()).add(employee);
        }
        EmployeeByDepartment.forEach((d,eps)->{
            System.out.println("Department:"+d);
            eps.forEach(e->System.out.println("-"+e.getName()));
        });
    }

}
