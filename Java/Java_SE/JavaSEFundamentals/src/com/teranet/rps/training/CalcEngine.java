package com.teranet.rps.training;

import java.util.Arrays;

public class CalcEngine {
    public static void main(String[] args) {
        double[] leftValues={100.d,44.5d,22.2d,66.8,67.5};
        double[] rightValues={50.0d,93.2d,22.6d,99.8,45.6};
        char[] opCodes = {'d','m','a','s'};
        double[] results = new double[opCodes.length];
        for(int index=0;index<opCodes.length;index++){
            switch(opCodes[index]){
                case 'a':
                    results[index]=leftValues[index]+rightValues[index];
                    break;
                case 's':
                    results[index]=leftValues[index]-rightValues[index];
                    break;
                case 'm':
                    results[index]=leftValues[index]*rightValues[index];
                    break;
                case 'd':
                    results[index]=rightValues[index] !=0 ? leftValues[index]/rightValues[index] :0.0d;
                    break;
                default:
                    System.out.println("Invalid Opcode");
                    results[index]=0.0d;
                    break;
            }
        }
        //Arrays.stream(results).sequential().forEach(item->System.out.println(item));
        for(double item: results){
            System.out.println(item);
        }
        //System.out.println("Results:"+results);
    }


}
