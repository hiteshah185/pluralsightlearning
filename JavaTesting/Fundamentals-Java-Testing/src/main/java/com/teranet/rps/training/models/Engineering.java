package com.teranet.rps.training.models;

public class Engineering {
    private final EngineeringType engineeringType;
    private final int studentsStrength;
    private final int facultyStrength;

    public Engineering(EngineeringType engineeringType, int studentsStrength, int facultyStrength) {
        this.engineeringType = engineeringType;
        this.studentsStrength = studentsStrength;
        this.facultyStrength = facultyStrength;
    }

    public EngineeringType getEngineeringType() {
        return engineeringType;
    }

    public int getStudentsStrength() {
        return studentsStrength;
    }

    public int getFacultyStrength() {
        return facultyStrength;
    }
}
