package com.himanshu.javajourney.fundamentals.input.basics;
import java.util.Scanner;

public class InteractiveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        if (secondNumber != 0) {
            int division = firstNumber / secondNumber;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division is not possible because the second number is zero.");
        }



        scanner.close();
    }
}
