package com.teranet.rps.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class StringWriter01 {
    public static void main(String[] args) {
        try(Writer writer = new FileWriter("SampleFiles/Notepad.txt");){
            writer.write("Hello Trivandrum from Teraner-TRV - RPS Team");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
