package com.teranet.rps.training.models;

import org.junit.jupiter.api.Test ;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;


public class CollegeTest02 {
    public static final int ELECTRICAL_STUDENT_STRENGTH = 9;
    public static final int AUTOMOBILE_FACULTY_STRENGTH = 20;
    private College testCollege;
    @BeforeEach
    public void before(){
        testCollege = new College();
    }

    @Test
    public void canStartElectricalDept(){
        addStudentsToCollege();
        Engineering EEDept = testCollege.startAcademicYear(EngineeringType.ELECTRICAL);
        assertThat(EEDept,hasProperty("studentsStrength",equalTo(ELECTRICAL_STUDENT_STRENGTH)));
        assertEquals(10,EEDept.getFacultyStrength(),"Wrong Faculty strength");
        assertEquals(EngineeringType.ELECTRICAL,EEDept.getEngineeringType(),"Wrong Engineering type");
    }
    @Test
    public void canElectricalDeptIntakeStudents(){
        addStudentsToCollege();
        testCollege.startAcademicYear(EngineeringType.ELECTRICAL);
        assertEquals(0,testCollege.getTotalStudents());
    }

    @Test
    public void startAnAutomobileDept(){
        addStudentsToCollege();
        var additionalStudentsForAutomobile =100;
        testCollege.addMoreStudents(additionalStudentsForAutomobile);
        testCollege.startAcademicYear(EngineeringType.AUTOMOBILE);
        Engineering EEDpt = testCollege.startAcademicYear(EngineeringType.ELECTRICAL);
        assertEquals(EngineeringType.ELECTRICAL,EEDpt.getEngineeringType());
    }
    @Test
    public void illegalStudentEntry(){
        addStudentsToCollege();
        assertThrows(IllegalStateException.class,
                ()->{
            testCollege.startAcademicYear(EngineeringType.AUTOMOBILE);
                },"Wrong Additional student added");
    }

    @Test
    public void invalidStudentCountEntry(){
        addStudentsToCollege();
        assertThrows(IllegalArgumentException.class,
                ()->{
            testCollege.addMoreStudents(-55);
                },"Invalid Student Count");
    }

    private void addStudentsToCollege(){
        testCollege.addMoreStudents(ELECTRICAL_STUDENT_STRENGTH);
        testCollege.addMoreFaculty(AUTOMOBILE_FACULTY_STRENGTH+80);
    }

}