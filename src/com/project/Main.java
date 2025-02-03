package com.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            printMenu();
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    ArithmeticDemo.runDemo(sc);
                    break;
                case 2:
                    TypeCastingDemo.runDemo(sc);
                    break;
                case 3:
                    BooleanLogicDemo.runDemo(sc);
                    break;
                case 4:
                    CharDemo.runDemo(sc);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exit demo");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Invalid choice. Select again");
        }
        sc.close();
    }

    private static void printMenu() {
        System.out.println("Data types playground:");
        System.out.println("1. Arithmetic Operations:");
        System.out.println("2. Type Casting & Conversion:");
        System.out.println("3. Boolean & Logical Operators:");
        System.out.println("4. Char Demo:");
        System.out.println("5. Exit");
    }
}