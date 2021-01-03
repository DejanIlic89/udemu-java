package com.udemy.java.supplier;

import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {

        Supplier<Double> random = Math::random;

        System.out.println(random.get());

    }
}
