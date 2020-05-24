package com.priojeetpriyom.main;

import java.math.BigInteger;

public class LeapYearChecker {
    public Boolean isLeapYear(String yearString) {
        BigInteger year = new BigInteger(yearString);

        if(isDivisible(year, new BigInteger("400") ) ) {
            return true;
        }

        if(isDivisible(year, new BigInteger("100"))) {
            return false;
        }

        if(isDivisible(year, new BigInteger("4"))) {
            return true;
        }

        return false;
    }

    private boolean isDivisible(BigInteger dividend, BigInteger divisor) {
        return dividend.mod(divisor).equals(new BigInteger("0"));
    }
}
