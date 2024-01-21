package com.teranet.rps.java;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample02 {
    public static void main(String[] args) {
        Path path1 = Path.of("/SampleFiles/NewFolderA/notes.jpg");
        Path path2 = Paths.get("d:/SampleFiles/NewFolderA/notes.jpg");
        Path path3 = Paths.get("//SampleFiles/NewFolderA/notes.jpg");

        System.out.println("Is Path Absolute:"+path1.isAbsolute());
        System.out.println("Show class:"+path2.getClass());
        System.out.println("Is Path Absolute:"+path2.isAbsolute());
        System.out.println("Is Path Absolute:"+path3.isAbsolute());

        Path rootOfNotes = path2.getRoot();
        System.out.println("Show root:"+rootOfNotes);

        Path resolved1 = path1.resolve(path2);
        System.out.println("Resolve 1 to 2:"+resolved1); //Concat two paths

        Path resolved2 = path1.resolveSibling(path2);
        System.out.println(resolved2);

        //Path relativize1 = path2.relativize(path1);
        //System.out.println(relativize1);

        Path normailzedPath = path3.normalize();
        System.out.println(normailzedPath);

    }
}
