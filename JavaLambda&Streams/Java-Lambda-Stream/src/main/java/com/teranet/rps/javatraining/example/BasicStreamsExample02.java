package com.teranet.rps.javatraining.example;

import com.teranet.rps.javatraining.models.Employee;
import com.teranet.rps.javatraining.models.SampleData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStreamsExample02 {
    public static void main(String[] args) {
        List<Employee> employeesList = SampleData.getEmployees();
        Stream<Employee> employeeStream = employeesList.stream();
        Stream<String> stringStream = Stream.of("T","R","I","V","A","N");
        Stream<String> nullableStream = Stream.ofNullable("Technopark");
        Stream<Employee> emptyStream = Stream.empty();


        IntStream dice = new Random().ints(1,7);
        try(BufferedReader in = new BufferedReader(new FileReader("README.md", StandardCharsets.UTF_8))){
            in.lines().forEach(System.out::println);
        }catch (IOException er){
            er.printStackTrace();
        }
    }
}
