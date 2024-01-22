package com.teranet.rps.java;

import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class ConsoleExample01 {
    public static void main(String[] args) {
        Console console = System.console();
        PrintWriter writer = console.writer();
        writer.println("Where are you from ?");
        String place = console.readLine();
        writer.println("What is your name ?");
        String firstName = console.readLine();
        writer.printf("Hello %s from %s",firstName,place);

        writer.printf("Write a strong password");
        char[] chars = console.readPassword();
        String newPassword = new String(chars);

        writer.printf("Write your favourite country ?");
        String favCountry = console.readLine();
        List<String> providedCountry = new Scanner(favCountry)
                .useDelimiter("")
                .tokens()
                .collect(Collectors.toList());
        writer.println(providedCountry);
    }
}
