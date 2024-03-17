package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int daysInMonth;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31;
            case 4, 6, 9, 11 -> daysInMonth = 30;
            case 2 -> daysInMonth = isLeapYear ? 29 : 28;
            default -> {
                System.out.println("Invalid month");
                return;
            }
        }
        System.out.println(daysInMonth);

    }

}
