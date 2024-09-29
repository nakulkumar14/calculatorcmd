package com.calculator;

public class StandardCalc extends Calculator {

    private static final String MESSAGE = """
                Please enter your choice:
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Clear last stored result
                0. Exit
                """;

    public StandardCalc(double result, double a, double b, boolean reset) {
        super(result, a, b, reset);
    }

    @Override
    public void displayMenu() {
        int choice = -1;
        do {
            displayFunctions(MESSAGE);
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    setResult(0);
                    setReset(true);
                    break;
                default:
                    if (choice != 0) {
                        System.out.println("Invalid choice");
                    }
            }
        } while (choice != 0);
    }
}
