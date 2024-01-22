package com.teranet.rps.java.models;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 2311449965967931540L;
    private  String firstName;
    private int age;

    public User() {
    }

    public User(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
