package com.calculator;

public class CalculatorFactory {
    public static Calculator getCalculator(CalcType calcType) {
        switch (calcType) {
            case STANDARD -> {
                return new StandardCalc(0, 0, 0, true);
            }
            case SCIENTIFIC -> {
                return new ScientificCalc(0, 0, 0, true);
            }
            default -> throw new IllegalArgumentException("Unknown calculator type");
        }
    }
}
