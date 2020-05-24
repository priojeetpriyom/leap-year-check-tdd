package com.priojeetpriyom.test;

import com.priojeetpriyom.main.LeapYearChecker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearCheckerTest {
    private static LeapYearChecker leapYearChecker;

    @BeforeAll
    public static void init() {
        leapYearChecker = new LeapYearChecker();
    }
    @Test
    void when4ThenLeapYear() {
        assertTrue(leapYearChecker.isLeapYear("4"));
    }

    @Test
    void when1ThenNotLeapYear() {
        assertFalse(leapYearChecker.isLeapYear("1"));
    }

    @Test
    void when5ThenNotLeapYear() {
        assertFalse(leapYearChecker.isLeapYear("5"));
    }

    @Test
    void whenDivisibleBy100ThenNotLeapYear() {
        assertFalse(leapYearChecker.isLeapYear("100"), "Failed for 100");
        assertFalse(leapYearChecker.isLeapYear("200"), "Failed for 200");
        assertFalse(leapYearChecker.isLeapYear("1000"), "Failed for 1000");
    }

    @Test
    void whenDivisibleBy400ThenLeapYear() {
        assertTrue(leapYearChecker.isLeapYear("400"), "Failed for 400");
        assertTrue(leapYearChecker.isLeapYear("800"), "Failed for 800");
        assertTrue(leapYearChecker.isLeapYear("4000"), "Failed for 4000");
    }

    @Test
    void whenLeapYearGreaterThanIntRangeThenLeapYear() {
        assertTrue(leapYearChecker.isLeapYear("4000000000000"), "Failed For 4000000000000");
    }

    @Test
    void whenNotLeapYearGreaterThanIntRangeThenLeapYear() {
        assertFalse(leapYearChecker.isLeapYear("4000000000000111"), "Failed For 4000000000000111");
    }

}
