package com.teranet.rps.training;

import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("No input entered.");
        } else if (args.length==3) {
            char operationCode = opCodeFromString(args[0]);
        }else {
            System.out.println("Invalid Entries.");
        }

    }
    public static void executeInteractive(){
        System.out.println("Enter an operation and two numbers");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftValue = valueFromWord(parts[1]);
        double rightValue =valueFromWord(parts[2]);
        double result=0.0d ;
        System.out.println("Result:"+result);
    }

    private static char opCodeFromString(String operationName){
        char opCode = operationName.charAt(0);
        return opCode;    }
    private static double valueFromWord(String word){
        String[] numberWords ={
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
        };
        double value = 0d;
        for(int i=0;i<numberWords.length;i++){
            if(word.equals(numberWords[i])){
                value=i;
                break;
            }
        }
        return value;
    }
}
