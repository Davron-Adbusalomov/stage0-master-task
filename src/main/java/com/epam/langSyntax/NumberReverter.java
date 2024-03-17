package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int num = 0;
        int divider = 1;

        // Reversing the digits of the number
        while (number > 0) {
            int digit = number % 10;
            num = num * 10 + digit;
            number /= 10;
        }
        System.out.println(num);
    }

}
