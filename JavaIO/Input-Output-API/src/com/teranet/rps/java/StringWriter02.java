package com.teranet.rps.java;

import java.io.IOException;
import java.io.StringWriter;

public class StringWriter02 {
    public static void main(String[] args) {
        try(StringWriter stringWriter = new StringWriter()){
            stringWriter.write("Hello Git Users !!");
            stringWriter.flush();
            StringBuffer buffer = stringWriter.getBuffer();
            String string =stringWriter.toString();
            System.out.println(string);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
