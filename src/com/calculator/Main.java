package com.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // addition, subtraction, multiplication and division.
        Scanner input = new Scanner(System.in);
        String message = """
                Please enter your choice:
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                0. Exit
                """;
        int choice = -1;
        do {
            System.out.println(message);
            choice = input.nextInt();
            int a = 0, b = 0;
            switch (choice) {
                case 1:
                    a = input.nextInt();
                    b = input.nextInt();
                    int sum = a + b;
                    System.out.println("Sum of a : " + a + " and b : " + b + " = " + sum);
                    break;
                case 2:
                    a = input.nextInt();
                    b = input.nextInt();
                    int sub = a - b;
                    System.out.println("Subtraction of a : " + a + " and b : " + b + " = " + sub);
                    break;
                case 3:
                   a = input.nextInt();
                   b = input.nextInt();
                   int mul = a * b;
                   System.out.println("Multiplication of a : " + a + " and b : " + b + " = " + mul);
                    break;
                case 4:
                    a = input.nextInt();
                    b = input.nextInt();
                    if (b == 0) {
                        System.out.println("Division by zero not allowed!!");
                    } else {
                        int div = a / b;
                        System.out.println("Division of a : " + a + " and b : " + b + " = " + div);
                    }
                    break;
                default:
                    if (choice != 0) {
                        System.out.println("Invalid choice");
                    }
            }
        } while (choice != 0);
    }
}