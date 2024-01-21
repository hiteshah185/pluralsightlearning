package com.teranet.rps.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReader01 {
    public static void main(String[] args) {
        try(Reader reader = new FileReader("SampleFiles/IndianNationalAnthem.txt");)
        {
            char[] buf = new char[16];
            StringBuilder sb = new StringBuilder();
            int read = reader.read(buf);
            while(read>0){
                sb.append(buf,0,read);
                read = reader.read(buf);
            }
            System.out.println("String: \n"+sb);
            //reader.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
