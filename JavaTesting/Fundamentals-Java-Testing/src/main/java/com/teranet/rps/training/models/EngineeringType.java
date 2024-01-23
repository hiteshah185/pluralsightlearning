package com.teranet.rps.training.models;

public enum EngineeringType {
    AUTOMOBILE(100,20),
    BIOMEDICAL(50,10),
    CIVIL(100,18),
    COMPUTER(80,12),
    CHEMICAL(90,18),
    ELECTRICAL(9,10),
    ELECTRONICS(60,15),
    ;
    private final int requiredStudents;
    private final int requiredFaculty;

    EngineeringType(int requiredStudents, int requiredFaculty) {
        this.requiredStudents = requiredStudents;
        this.requiredFaculty = requiredFaculty;
    }

    public int getRequiredStudents() {
        return requiredStudents;
    }

    public int getRequiredFaculty() {
        return requiredFaculty;
    }
}
