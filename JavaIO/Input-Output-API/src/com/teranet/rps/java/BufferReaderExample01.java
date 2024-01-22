package com.teranet.rps.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class BufferReaderExample01 {
    public static void main(String[] args) {
        Path path =Path.of("SampleFiles/IndianNationalAnthem.txt");
        try(BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String line = bufferedReader.readLine();
            while (line!=null){
                System.out.println("Line = "+line);
                line = bufferedReader.readLine();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        try (BufferedReader bufferedReader = Files.newBufferedReader(path);){
            Stream<String> lines = bufferedReader.lines();
            lines.forEach(System.out::println);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
