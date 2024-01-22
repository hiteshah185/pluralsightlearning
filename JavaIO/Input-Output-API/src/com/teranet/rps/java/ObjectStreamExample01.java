package com.teranet.rps.java;

import com.teranet.rps.java.models.User;

import java.io.*;

public class ObjectStreamExample01 {
    public static void main(String[] args) {
        User manger = new User("Geethu",32);
        User colleague = new User("Anjana",32);
        try(FileOutputStream fos = new FileOutputStream("SampleFiles/users.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(manger);
            oos.writeObject(colleague);
        }catch (IOException ex){ex.printStackTrace();}
        try(FileInputStream fis = new FileInputStream("SampleFiles/users.bin");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            User geethu = (User)ois.readObject();
            User anjana = (User)ois.readObject();
            System.out.println("Manager="+geethu.getFirstName());
            System.out.println("Colleague="+anjana.getFirstName());
        }catch (IOException | ClassNotFoundException e){e.printStackTrace();}

    }
}
