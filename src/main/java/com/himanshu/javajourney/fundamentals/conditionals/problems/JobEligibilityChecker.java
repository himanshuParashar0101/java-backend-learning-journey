package com.himanshu.javajourney.fundamentals.conditionals.problems;

public class JobEligibilityChecker {

    public static void main(String[] args) {
        int age = 25;
        boolean knowsJava = true;
        boolean knowsSpringBoot = true;

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age >= 25 && knowsJava && knowsSpringBoot) {
            System.out.println("You are ready to apply for Java backend jobs.");
        } else if (age >= 18 && knowsJava && !knowsSpringBoot) {
            System.out.println("Learn Spring Boot before applying.");
        } else if (age >= 18 && !knowsJava) {
            System.out.println("Continue learning Java fundamentals.");
        } else if (age >= 18) {
            System.out.println("You have the required skills, but the selected minimum age criterion is 25.");
        } else {
            System.out.println("You do not meet the minimum age requirement.");
        }
    }
}