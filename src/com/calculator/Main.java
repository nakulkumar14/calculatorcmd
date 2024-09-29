package com.calculator;

import java.util.Scanner;

public class Main {

    static final Scanner input = new Scanner(System.in);

    private Calculator selectCalculator() {
        String MENU = """
                Please select calculator from below:
                1. Standard
                2. Scientific
                3. Programmer
                0. Exit
                """;
        Calculator calculator = null;
        int in = -1;
        do {
            System.out.println(MENU);
            in = input.nextInt();
            switch (in) {
                case 1:
                    return CalculatorFactory.getCalculator(CalcType.STANDARD);
                case 2:
                    return CalculatorFactory.getCalculator(CalcType.SCIENTIFIC);
                case 3:
                    return CalculatorFactory.getCalculator(CalcType.PROGRAMMER);
                default:
                    if (in != 0) {
                        System.out.println("Invalid choice");
                    }
            }
        } while (in != 0);
        return calculator;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Calculator calculator = main.selectCalculator();
        if (calculator != null) {
            calculator.displayMenu();
        }
    }
}