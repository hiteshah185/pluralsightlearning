package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.util.ArrayList;
import java.util.List;

public class AdvancedStreamsExample03 {
    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();
        List<String> namesOfEmployee = employeeList.stream()
                .reduce(new ArrayList<>(),(list,employee)->{
                    ArrayList<String> nameList = new ArrayList<>();
                    nameList.add(employee.getName());
                    return nameList;
                }, (list1,list2)->{
                            ArrayList<String> newList = new ArrayList<>(list1);
                            newList.addAll(list2);
                            return newList;
                        });
        System.out.println(namesOfEmployee);

        List<String> namesOfEmployeeFromCollect = employeeList.stream()
                .collect(
                        ArrayList::new,
                        (list,employee)->{list.add(employee.getName());},
                        ArrayList::addAll
                );
        System.out.println(namesOfEmployee);
    }
}
