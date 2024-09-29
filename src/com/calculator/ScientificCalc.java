package com.calculator;

public class ScientificCalc extends Calculator {

    private static final String MESSAGE = """
            Please enter your choice:
            1. Addition
            2. Subtraction
            3. Multiplication
            4. Division
            5. |X| - Mod of x
            6. 1/x
            7. n!
            8. x^y (x to power of y)
            11. Clear last stored result
            0. Exit
            """;

    public ScientificCalc(double result, double a, double b, boolean reset) {
        super(result, a, b, reset);
    }

    @Override
    public void displayFunctions() {
        System.out.println(MESSAGE);
    }

    @Override
    public void displayMenu() {
        int choice = -1;
        do {
            displayFunctions();
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
                    setA(input.nextDouble());
                    setReset(false);
                    modX(getA());
                    break;
                case 6:
                    setA(input.nextDouble());
                    setReset(false);
                    reciprocal(getA());
                    break;
                case 7:
                    setA(input.nextDouble());
                    factorial(getA());
                    setReset(false);
                    break;
                case 8:
                    power();
                    break;
                case 11:
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

    private void power() {
        inputOperands();
        setResult(Math.pow(getA(), getB()));
        System.out.println("x = " + getA() + " to the power of y = " + getB() + " = " + getResult());
    }

    private void factorial(double a) {
        double factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        setResult(factorial);
        System.out.println("Factorial of " + a + " is " + factorial);
    }

    private double modX(double x) {
        setResult(Math.abs(x));
        System.out.println("Mod of X: " + x + " = " + getResult());
        return getResult();
    }

    private void reciprocal(double x) {
        setResult(1/x);
        System.out.println("1/x: (1/" + x + ") = " + getResult());
    }
}
