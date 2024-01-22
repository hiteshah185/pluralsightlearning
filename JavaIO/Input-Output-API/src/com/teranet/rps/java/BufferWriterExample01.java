package com.teranet.rps.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferWriterExample01  {
    public static void main(String[] args) {
        Path path = Path.of("SampleFiles/Notepad.txt");
        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path)){
            bufferedWriter.write("Writing from a buffer Writer.");

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
