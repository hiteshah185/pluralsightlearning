package com.teranet.rps.training.models;

public class College {
    private int totalStudents = 0;
    private int totalFaculty = 0;
    public Engineering startAcademicYear(EngineeringType engineeringType){
        return startAcademicYear(engineeringType,1);
    }

    public Engineering startAcademicYear(EngineeringType engineeringType,int totalPeople){
        checkIfPositive(totalPeople);
        int requiredStudents = engineeringType.getRequiredStudents();
        int requiredFaculty = engineeringType.getRequiredFaculty();
        if(requiredFaculty>totalFaculty || requiredStudents > totalStudents){
            throw new IllegalArgumentException();
        }
        totalStudents-=requiredStudents;
        totalFaculty-=requiredFaculty;
        return new Engineering(engineeringType,requiredStudents,requiredFaculty);
    }

    public void addMoreStudents(int countOfNewAdmissions){
        checkIfPositive(countOfNewAdmissions);
        totalStudents+=countOfNewAdmissions;
    }
    public void addMoreFaculty(int countOfNewHiring){
        checkIfPositive(countOfNewHiring);
        totalFaculty+=countOfNewHiring;
    }
        private void checkIfPositive(int value){
        if(value<1){throw new IllegalArgumentException();}
        }

    public int getTotalStudents() {
        return totalStudents;
    }

    public int getTotalFaculty() {
        return totalFaculty;
    }
}
