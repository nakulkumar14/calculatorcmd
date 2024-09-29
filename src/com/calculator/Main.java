package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // addition, subtraction, multiplication and division.
        Scanner input = new Scanner(System.in);
        Calculator calculator = CalculatorFactory.getCalculator(CalcType.STANDARD);
        int choice = -1;
        do {
            calculator.displayFunctions();
            choice = input.nextInt();
            double a = 0, b = 0;
            switch (choice) {
                case 1:
                    if (calculator.isReset()) {
                        a = input.nextDouble();
                        calculator.setA(a);
                        calculator.setReset(false);
                    } else {
                        calculator.setA(calculator.getResult());
                    }
                    b = input.nextDouble();
                    calculator.setB(b);
                    calculator.addition();
                    break;
                case 2:
                    if (calculator.isReset()) {
                        a = input.nextDouble();
                        calculator.setA(a);
                        calculator.setReset(false);
                    } else {
                        calculator.setA(calculator.getResult());
                    }
                    b = input.nextDouble();
                    calculator.setB(b);
                    calculator.subtraction();
                    break;
                case 3:
                    if (calculator.isReset()) {
                        a = input.nextDouble();
                        calculator.setA(a);
                        calculator.setReset(false);
                    } else {
                        calculator.setA(calculator.getResult());
                    }
                    b = input.nextDouble();
                    calculator.setB(b);
                    calculator.multiplication();
                    break;
                case 4:
                    if (calculator.isReset()) {
                        a = input.nextDouble();
                        calculator.setA(a);
                        calculator.setReset(false);
                    } else {
                        calculator.setA(calculator.getResult());
                    }
                    b = input.nextDouble();
                    calculator.setB(b);
                    if (b == 0) {
                        System.out.println("Division by zero not allowed!!");
                    } else {
                        calculator.division();
                    }
                    break;
                case 5:
                    calculator.setResult(0);
                    calculator.setReset(true);
                    break;
                default:
                    if (choice != 0) {
                        System.out.println("Invalid choice");
                    }
            }
        } while (choice != 0);
    }
}