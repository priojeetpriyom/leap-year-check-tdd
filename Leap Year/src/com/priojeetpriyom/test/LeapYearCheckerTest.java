package com.priojeetpriyom.test;

import com.priojeetpriyom.main.LeapYearChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearCheckerTest {

    @Test
    void when4ThenLeapYear() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertTrue(leapYearChecker.isLeapYear(4));
    }

}
