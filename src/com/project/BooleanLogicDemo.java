package com.project;

import java.util.Scanner;

public class BooleanLogicDemo {
    public static void runDemo(Scanner sc) {
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        // Check if the user is legit to vote
        boolean isEligible = (age >= 18);
        System.out.println("Eligible to vote? " + isEligible);

        // logical operators
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolVal = sc.nextBoolean();
        boolean notBoolVal = !boolVal;
        System.out.println("The opposite of " + boolVal + " is " + notBoolVal);
    }
}