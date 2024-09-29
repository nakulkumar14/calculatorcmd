package com.calculator;

import java.util.Scanner;

public abstract class Calculator {
    private double result;
    private double a;
    private double b;
    private boolean reset;
    protected final Scanner input;

    public Calculator(double result, double a, double b, boolean reset) {
        input = new Scanner(System.in);
        this.result = result;
        this.a = a;
        this.b = b;
        this.reset = reset;
    }

    public void displayFunctions(String message) {
        System.out.println(message);
    }

    public abstract void displayMenu();

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public boolean isReset() {
        return reset;
    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

    public void performAddition() {
        inputOperands();
        operation('+');
    }

    public void performSubtraction() {
        inputOperands();
        operation('-');
    }

    public void performMultiplication() {
        inputOperands();
        operation('*');
    }

    public void performDivision() {
        inputOperands();
        if (b == 0) {
            System.out.println("Division by zero not allowed!!");
        } else {
            operation('/');
        }
    }

    protected void inputOperands() {
        inputSingleOperand();
        b = input.nextDouble();
        setB(b);
    }

    protected void inputSingleOperand() {
        if (isReset()) {
            a = input.nextDouble();
            setA(a);
            setReset(false);
        } else {
            setA(getResult());
        }
    }

    private double operation(char op) {
        switch(op) {
            case '+':
                result = a + b;
                System.out.println("Sum of a : " + a + " and b : " + b + " = " + result);
                return result;
            case '-':
                result = a - b;
                System.out.println("Subtraction of a : " + a + " and b : " + b + " = " + result);
                return result;
            case '*':
                result = a * b;
                System.out.println("Multiplication of a : " + a + " and b : " + b + " = " + result);
                return result;
            case '/':
                if (b == 0) {
                    System.out.println("Division by zero not allowed!!");
                } else {
                    result = a / b;
                    System.out.println("Division of a : " + a + " and b : " + b + " = " + result);
                    return result;
                }
            default:
                throw new UnsupportedOperationException("Operation : "+ op +" not supported");
        }
    }
}
