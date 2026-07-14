package com.himanshu.javajourney.fundamentals.conditionals.problems;

public class GradeResultChecker {

    public static void main(String[] args) {
        int marks = 10;

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Very Good");
        } else if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}