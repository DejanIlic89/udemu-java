package com.udemy.java.lambda;

import com.udemy.java.lambda.MathOperation;

public class TestCalculator {
    public static void main(String[] args) {

//        String exp = "5 + 2 - 3 * 7 + 2 / 3";
//        String exp = "10 / 2 * 3 - 3 / 3 * 5";
//        String exp = "9 * 9 - 1 * 7 / 8 + 30";
        String exp = "9 * 9 - 1 * 7 / 8 + 30 ^ 2 % 3";

        Calculator.addOperation("^", (a, b) -> (int) Math.pow(a, b));
        Calculator.addOperation("%", (a, b) -> a % b);

        System.out.println(
                Calculator.calculate(exp)
        );



//        final MathOperation add = (s1, s2) -> s1 + s2;
//        final MathOperation subtract = (s1, s2) -> s1 - s2;
//        final MathOperation multiply = (s1, s2) -> s1 * s2;
//        final MathOperation divide = (s1, s2) -> s1 / s2;
//
//        int onScreenNumber = 0;
//
//        onScreenNumber = calculate(5, add, 2);
//        onScreenNumber = calculate(onScreenNumber, subtract, 3);
//        onScreenNumber = calculate(onScreenNumber, multiply, 7);
//        onScreenNumber = calculate(onScreenNumber, add, 2);
//        onScreenNumber = calculate(onScreenNumber, divide, 3);
//
//        System.out.println(onScreenNumber);

//        System.out.println(calculate(calculate(calculate(calculate(calculate(5, add, 2), subtract, 3), multiply, 7), sum, 2), divide, 3));
    }

//    private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber) {
//        return mathOperation.operate(onScreenNumber, enteredNumber);
//    }
}
