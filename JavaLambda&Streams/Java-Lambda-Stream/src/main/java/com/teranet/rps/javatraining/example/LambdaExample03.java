package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LambdaExample03 {
    public static void main(String[] args) {
        List<Employee> employeeList = SampleData.getEmployees();
        try(FileWriter writer = new FileWriter("employees.txt")){
            employeeList.forEach(employee -> {
                try{
                    writer.write(employee.getName().toUpperCase()+"\n");
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            });
        }catch (IOException ex){
            System.err.println("An Exception Occurred:"+ex.getMessage());
        }
    }
}
