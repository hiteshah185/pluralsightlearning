package com.teranet.rps.training.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {
    private LeapYear leapYear;
    @BeforeEach
    public void before(){
        leapYear = new LeapYear();
    }
    @Test
    public void leapYearAreDivisibleBy4(){
        assertTrue(leapYear.isLeapYear2(2024),"Method Fails");
    }
    @Test
    public void notALeapYear(){
        assertFalse(leapYear.isLeapYear2(2025),"Non-Leap year fails");
    }
    @Test
    public void leapYearDivisibleBy100(){
        assertFalse(leapYear.isLeapYear2(1900),"Divisibility by 100 fails");
    }
    @Test
    public void leapYearDivisibleBy400(){
        assertTrue(leapYear.isLeapYear2(2000),"Divisibility by 400 fails.");
    }
}
