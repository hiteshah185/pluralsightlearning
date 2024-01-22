package com.teranet.rps.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferWriterExample02 {
    public static void main(String[] args) {
        Path path = Path.of("SampleFiles/Notepad.txt");
        try(FileWriter fileWriter = new FileWriter("SampleFiles/Notepad.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);){
            Files.newBufferedReader(path);
            bufferedWriter.write("Writing from files-Buffered Writer");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
