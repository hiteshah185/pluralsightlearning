package com.teranet.rps.java;

import java.io.*;

public class InputStreamExample01 {
    public static void main(String[] args) {
        byte[] header ={0xC, 0xA, 0xF, 0xE, 0xB, 0xA, 0xB, 0xE};
        try(OutputStream os = new FileOutputStream("SampleFiles/data.bin")){
            os.write(header);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        try(InputStream inputStream = new FileInputStream("SampleFiles/data.bin")){
            byte[] allBytes = inputStream.readAllBytes();
            for(byte b:allBytes){
                System.out.printf("0x%x ", b);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
