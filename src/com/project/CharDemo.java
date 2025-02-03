package com.project;

import java.util.Scanner;

public class CharDemo {
    public static void runDemo(Scanner sc) {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // chỉ lấy 1 char đầu tiên

        // Display the Unicode code point
        int codePoint = ch;
        System.out.println("Unicode code point of '" + ch + "' is: " + codePoint);

        // Convert a code point back to character (assuming valid range)
        System.out.print("Enter a Unicode code point (integer): ");
        int newCodePoint = sc.nextInt();
        char newChar = (char) newCodePoint;
        System.out.println("The character for code point " + newCodePoint + " is: " + newChar);
    }
}