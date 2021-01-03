package com.udemy.java.function;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {

        Function<String, Integer> strLen = String::length;
        Function<Integer, Integer> plus2 = i -> i + 2;
        Function<Integer, Integer> square = i -> i * i;

        System.out.println(
//                plus2.andThen(square).apply(8) //8+2=10 -> 10*10=100
                plus2.compose(square).apply(8) // 8*8=64 -> 64+2=66
//                strLen.andThen(square).apply("Hi hello how are you")
        );


    }

}
