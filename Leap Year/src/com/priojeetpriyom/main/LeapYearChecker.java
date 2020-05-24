package com.priojeetpriyom.main;

public class LeapYearChecker {
    public Boolean isLeapYear(int year) {
        if(year % 4 == 0) {
            return true;
        }
        
        return false;
    }
}
