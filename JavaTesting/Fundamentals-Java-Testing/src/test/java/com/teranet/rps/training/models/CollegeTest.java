package com.teranet.rps.training.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CollegeTest {
    @Test
    public void canStartAcademicYear(){
        //Given
        College college = new College();
        college.addMoreStudents(10);
        college.addMoreFaculty(100);

        //When
        Engineering electricalDep = college.startAcademicYear(EngineeringType.ELECTRICAL);

        //Then
        assertEquals(9,electricalDep.getStudentsStrength());
        assertEquals(10,electricalDep.getFacultyStrength());
        assertEquals(EngineeringType.ELECTRICAL,electricalDep.getEngineeringType());

    }

    @Test
    public void startAcademicYearInCollege(){
        College keralaTechCollege = new College();
        keralaTechCollege.addMoreStudents(55);
        keralaTechCollege.addMoreFaculty(30);

        keralaTechCollege.startAcademicYear(EngineeringType.BIOMEDICAL);


        assertEquals(5,keralaTechCollege.getTotalStudents());

    }

    @Test
    public void canStartComputerDepartment(){
        College newCollege = new College();
        newCollege.addMoreFaculty(20);
        newCollege.addMoreStudents(100);

        Engineering computerDepartment = newCollege.startAcademicYear(EngineeringType.COMPUTER);

        assertEquals(EngineeringType.COMPUTER, computerDepartment.getEngineeringType());
        assertEquals(12,computerDepartment.getFacultyStrength());
        assertEquals(8,newCollege.getTotalFaculty());
    }

    @Test
    public void canStartTwoDepartments(){
        College myNewCollege = new College();
        myNewCollege.addMoreFaculty(50);
        myNewCollege.addMoreStudents(180);

        Engineering ECEDept =  myNewCollege.startAcademicYear(EngineeringType.ELECTRONICS);
        Engineering CivilDept = myNewCollege.startAcademicYear(EngineeringType.CIVIL);
        assertEquals(17,myNewCollege.getTotalFaculty());
        assertEquals(20,myNewCollege.getTotalStudents());
    }

    @Test
    public void aTestThatThrowsIllegalArgument(){
        College illegalCollege = new College();

        assertThrows(IllegalArgumentException.class,
                ()->illegalCollege.addMoreStudents(-1));
    }
    @Test
    public void aTestThatThrowIllegalState(){
        College illegalStateCollege = new College();
        illegalStateCollege.addMoreStudents(10);

        assertThrows(IllegalStateException.class,
                ()->{
            illegalStateCollege.startAcademicYear(EngineeringType.CHEMICAL);
                },"Illegal State to start an academic year");
    }
}
