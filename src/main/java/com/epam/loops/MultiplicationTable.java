package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(numberTableToPrint + " * " + i + " = " + (numberTableToPrint * i));
        }
    }
}
