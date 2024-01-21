package com.teranet.rps.java;

import java.io.File;
import java.io.IOException;

public class FileExample01 {
    public static void main(String[] args) throws IOException {
        File textFile = new File("SampleFiles/IndianNationalAnthem.txt");
        System.out.println("Is file exist:"+textFile.exists());
        System.out.println("Is a Directory:"+textFile.isDirectory());
        System.out.println("Is a File:"+textFile.isFile());

        //boolean newFileCreated = file.createNewFile();

        File newDir = new File("SampleFiles/NewFolderA");
        //boolean isDirectoryCreated = newDir.mkdir();

        File newLocationFolder = new File("SampleFiles/data1/data2");
        //System.out.println("Make new Location:"+newLocationFolder.mkdirs());.

        //newDir.delete();

        System.out.println();
        System.out.println("Get Name:"+newLocationFolder.getName());
        System.out.println("Get Parent Path:"+newLocationFolder.getParent());
        System.out.println("Get Path:"+newLocationFolder.getPath());

        System.out.println();
        System.out.println("Get Absolute Path:"+textFile.getAbsolutePath());
        System.out.println("Get Canonical Path:"+textFile.getCanonicalPath()); //System Dependent Path - will vary on Unix Systems.
    }
}
