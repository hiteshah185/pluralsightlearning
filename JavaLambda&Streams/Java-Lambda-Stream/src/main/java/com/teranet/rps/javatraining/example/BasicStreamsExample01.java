package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.util.stream.Stream;

public class BasicStreamsExample01 {
    public static void main(String[] args) {
        Stream <Employee> employeeStream = SampleData.getEmployees().stream();

        //Streams Require terminal operations
/*        employeeStream.map(e->{
            System.out.println(e.getName())
                });*/

        employeeStream.forEach(e->{System.out.println(e.getName());});
    }
}
