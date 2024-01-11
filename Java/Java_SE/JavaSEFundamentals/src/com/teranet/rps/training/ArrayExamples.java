package com.teranet.rps.training;

public class ArrayExamples {
    public static void main(String[] args) {
        float[] theValues = new float[8];
        theValues[2]=3.2f;
        theValues[3]=1.8f;
        float sum = 0.0f;
        for(int index=0;index<theValues.length;index++){
            sum+=theValues[index];
        }
        System.out.println(sum);
    }
}
