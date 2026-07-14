package com.himanshu.javajourney.fundamentals.conditionals.problems;

public class NumberAnalyzer {

    public static void main(String[] args) {
        int number = 0;

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}