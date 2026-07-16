package com.himanshu.javajourney.fundamentals.input.basics;
import java.util.Scanner;

public class VotingChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You are too young your " + age + " is  less than 18" );

        }
        else {
            System.out.println("you are illegible");
        }
        scanner.close();
    }
}
