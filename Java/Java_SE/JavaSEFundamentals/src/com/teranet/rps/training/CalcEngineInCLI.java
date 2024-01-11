package com.teranet.rps.training;

public class CalcEngineInCLI {
    public static void main(String[] args) {
        double leftValues=100.d;
        double rightValues=50.0d;
        if(args.length==0) {

            //char[] opCodes = {'d', 'm', 'a', 's'};
            char opCodes ='s';
            double results = executeCalc(opCodes, leftValues, rightValues);

                System.out.println(results);

        } else if (args.length==3) {
            handleCommandLineArguments(args);
        }else {
            System.out.println("Please provide an operation code and 2 numeric values.");
        }
    }

    private static void handleCommandLineArguments(String[] args) {
        char opCode = args[0].charAt(0);
        double leftValue = Double.parseDouble(args[1]);
        double rightValue = Double.parseDouble(args[2]);
        double result = executeCalc(opCode,leftValue,rightValue);
        System.out.println(result);
    }

    static double executeCalc(char opCodes, double leftValues, double rightValues){
        double result;
            switch (opCodes){
                case 'a':
                    result=leftValues+rightValues;
                    break;
                case 's':
                    result=leftValues-rightValues;
                    break;
                case 'm':
                    result=leftValues*rightValues;
                    break;
                case 'd':
                    result=rightValues!=0?leftValues/rightValues:0;
                    break;
                default:
                    System.out.println("Invalid Case");
                    result=0;
                    break;
            }

        return result;
    }
}
