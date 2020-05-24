package com.priojeetpriyom.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t--- ENTER BLANK LINE TO FINISH THE PROGRAM ---");
        System.out.print("Please Enter a Year: ");

        while(scanner.hasNextLine()) {
            String yearString = scanner.nextLine().trim();

            if(yearString.isEmpty()) {
                break;
            }

            Boolean isLeapYear = leapYearChecker.isLeapYear(yearString);

            if(isLeapYear) {
                System.out.println(yearString + " is a Leap Year");
            } else {
                System.out.println(yearString + " is not a Leap Year");
            }

            System.out.print("Please Enter a Year: ");
        }
    }
}
