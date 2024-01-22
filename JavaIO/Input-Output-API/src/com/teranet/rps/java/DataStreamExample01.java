package com.teranet.rps.java;

import java.io.*;

public class DataStreamExample01 {
    public static void main(String[] args) {
        String[] names = {"Paul","Geethu","Yadhu","Alan"};
        byte[] bytes ={};
        try(ByteArrayOutputStream os = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(os)){
            for(String name:names){
                dos.writeChars(name);
            }
            dos.flush();
            bytes = os.toByteArray();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println("Bytes.length:"+bytes.length);
        try(ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            DataInputStream dis = new DataInputStream(bis)){
            for(int i=0;i<names.length;i++){
                char read = dis.readChar();
                System.out.println("Read: "+read);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
