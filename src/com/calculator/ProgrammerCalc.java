package com.calculator;

public class ProgrammerCalc extends Calculator {
    private static final String MESSAGE = """
            Please enter your choice:
            1. Decimal to binary
            2. Binary to decimal
            3. Decimal to hexadecimal
            4. Hexadecimal to decimal
            5. Decimal to octal
            6. Octal to decimal
            7. Right shift
            8. Left shift
            0. Exit
            """;

    private String binaryString;
    private String hexString;
    private String octalString;
    private int number;

    public ProgrammerCalc(double result, double a, double b, boolean reset) {
        super(result, a, b, reset);
        binaryString = "";
        hexString = "";
        octalString = "";
    }

    @Override
    public void displayMenu() {
        int choice = -1;
        do {
            displayFunctions(MESSAGE);
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    number = input.nextInt();
                    decimalToBinary(number);
                    break;
                case 2:
                    binaryString = input.next();
                    binaryToDecimal(binaryString);
                    break;
                case 3:
                    number = input.nextInt();
                    decimalToHex(number);
                    break;
                case 4:
                    hexString = input.next();
                    hexToDecimal(hexString);
                    break;
                case 5:
                    number = input.nextInt();
                    decimalToOctal(number);
                    break;
                case 6:
                    octalString = input.next();
                    octalToDecimal(octalString);
                    break;
                case 7:
                    number = input.nextInt();
                    rightShift(number);
                    break;
                case 8:
                    number = input.nextInt();
                    leftShift(number);
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

    private void rightShift(int number) {
        int rightShift = number >> 1;
        System.out.println("Right shift of number " + number + " is " + rightShift);
    }

    private void leftShift(int number) {
        int leftShift = number << 1;
        System.out.println("Left shift of number " + number + " is " + leftShift);
    }

    private void decimalToOctal(double a) {
        String octalString = Integer.toOctalString((int) a);
        System.out.println("Decimal to octal: " + octalString);
    }

    private void octalToDecimal(String octalString) {
        int decimal = Integer.parseInt(octalString, 8);
        System.out.println("Octal to decimal: " + decimal);
    }

    private void hexToDecimal(String hexString) {
        int decimal = Integer.parseInt(hexString, 16);
        System.out.println("Hexadecimal to decimal: " + decimal);
    }

    private void decimalToHex(double a) {
        String hex = Integer.toHexString((int) a);
        System.out.println("Decimal to hexadecimal: " + hex);
    }

    private void decimalToBinary(double a) {
        String binaryString = Integer.toBinaryString((int) a);
        System.out.println("Decimal : " + a + " to binary: " + binaryString);
    }

    private void binaryToDecimal(String binaryString) {
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println("Binary : " + binaryString + " to decimal: " + decimal);
    }

}
