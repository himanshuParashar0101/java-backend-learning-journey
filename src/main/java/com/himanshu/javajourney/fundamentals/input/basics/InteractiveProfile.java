import java.util.Scanner;

public class InteractiveProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("My name is " + name);
        System.out.println("My age is " + age);

        if (age >= 18) {
            System.out.println("I am an adult.");
        } else {
            System.out.println("I am not an adult.");
        }

        scanner.close();
    }
}