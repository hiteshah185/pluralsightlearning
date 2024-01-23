package com.teranet.rps.training.models;

import org.apache.maven.surefire.shared.lang3.builder.ToStringExclude;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
