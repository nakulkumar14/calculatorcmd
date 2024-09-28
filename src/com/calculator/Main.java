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
                5. Clear last stored result
                0. Exit
                """;
        int choice = -1;
        boolean reset = true;
        int result = 0;
        do {
            System.out.println(message);
            choice = input.nextInt();
            int a = 0, b = 0;
            switch (choice) {
                case 1:
                    if (reset) {
                        a = input.nextInt();
                        reset = false;
                    } else {
                        a = result;
                    }
                    b = input.nextInt();
                    result = a + b;
                    System.out.println("Sum of a : " + a + " and b : " + b + " = " + result);
                    break;
                case 2:
                    if (reset) {
                        a = input.nextInt();
                        reset = false;
                    } else{
                        a = result;
                    }
                    b = input.nextInt();
                    result = a - b;
                    System.out.println("Subtraction of a : " + a + " and b : " + b + " = " + result);
                    break;
                case 3:
                    if (reset) {
                        a = input.nextInt();
                        reset = false;
                    } else{
                        a = result;
                    }
                   b = input.nextInt();
                   result = a * b;
                   System.out.println("Multiplication of a : " + a + " and b : " + b + " = " + result);
                    break;
                case 4:
                    if (reset) {
                        a = input.nextInt();
                        reset = false;
                    } else{
                        a = result;
                    }
                    b = input.nextInt();
                    if (b == 0) {
                        System.out.println("Division by zero not allowed!!");
                    } else {
                        result = a / b;
                        System.out.println("Division of a : " + a + " and b : " + b + " = " + result);
                    }
                    break;
                case 5:
                    result = 0;
                    reset = true;
                    break;
                default:
                    if (choice != 0) {
                        System.out.println("Invalid choice");
                    }
            }
        } while (choice != 0);
    }
}