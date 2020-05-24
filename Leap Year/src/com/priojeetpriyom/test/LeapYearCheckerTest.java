package com.priojeetpriyom.test;

import com.priojeetpriyom.main.LeapYearChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearCheckerTest {

    @Test
    void when4ThenLeapYear() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertTrue(leapYearChecker.isLeapYear(4));
    }

    @Test
    void when1ThenNotLeapYear() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertFalse(leapYearChecker.isLeapYear(1));
    }

    @Test
    void when5ThenNotLeapYear() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertFalse(leapYearChecker.isLeapYear(5));
    }

    @Test
    void whenDivisibleBy100ThenNotLeapYear() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertFalse(leapYearChecker.isLeapYear(100), "Failed for 100");
    }

}
