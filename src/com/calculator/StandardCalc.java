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
    public void displayFunctions() {
        System.out.println(MESSAGE);
    }
}
