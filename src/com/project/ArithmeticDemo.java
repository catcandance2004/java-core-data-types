package com.project;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void runDemo(Scanner sc) {
        System.out.println("Enter 1st int: ");
        int no1 = sc.nextInt();
        System.out.println("Enter 2nd int: ");
        int no2 = sc.nextInt();

        System.out.println("Add: " + no1 + " + " + no2 + " = " + (no1+no2));
        System.out.println("Sub: " + no1 + " - " + no2 + " = " + (no1-no2));
        System.out.println("Mul: " + no1 + " * " + no2 + " = " + (no1*no2));
        if (no2 != 0) {
            System.out.println("Div: " + no1 + " / " + no2 + " = " + (no1/no2));
            System.out.println("Mod: " + no1 + " % " + no2 + " = " + (no1%no2));
        } else {
            System.out.println("Not allowed");
        }
    }
}