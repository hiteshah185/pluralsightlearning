package com.teranet.rps.training;

public class CalcEngineWithWrapperClass {
    static double valeFromWord(String word){
        String[] numberWords={
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"

        };
        boolean isValueSet =false;
        double value = 0.0d;
        for(int index=0;index<numberWords.length;index++){
            if(word.equals(numberWords[index])){
                value=index;
                isValueSet=true;
                break;
            }
        }
        if(!isValueSet){
            value = Double.parseDouble(word);
        }
        return value;
    }
}
