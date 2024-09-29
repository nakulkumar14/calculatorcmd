package com.calculator;

public abstract class Calculator {
    private double result;
    private double a;
    private double b;
    private boolean reset;

    public Calculator(double result, double a, double b, boolean reset) {
        this.result = result;
        this.a = a;
        this.b = b;
        this.reset = reset;
    }

    public abstract void displayFunctions();

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

    protected double addition() {
        return operation('+');
    }

    protected double subtraction() {
        return operation('-');
    }

    protected double multiplication() {
        return operation('*');
    }

    protected double division() {
        return operation('/');
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
