package com.project;

import java.util.Scanner;

public class TypeCastingDemo {
    public static void runDemo(Scanner sc) {
        System.out.println("== Type Casting and Conversion Demo ==");

        // Implicit casting: int to double
        System.out.print("Enter an integer number: ");
        int intVal = sc.nextInt();
        double doubleVal = intVal;  // automatic conversion
        System.out.println("Implicit Casting: int (" + intVal + ") to double = " + doubleVal);

        // Explicit casting: double to int
        System.out.print("Enter a decimal number: ");
        double no = sc.nextDouble();
        int castedInt = (int) no;  // explicit conversion (truncates decimals)
        System.out.println("Explicit Casting: double (" + no + ") to int = " + castedInt);

        // Casting char to int to get Unicode code point
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);
        int charCode = (int) ch;
        System.out.println("The Unicode code point of '" + ch + "' is: " + charCode);
    }
}
