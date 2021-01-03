package com.udemy.java.primitiveStrims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class TestPrimitiveStreams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello world :: " + i);
//        }
//
//        IntStream.range(1, 10)
//                .forEach(i -> System.out.println("Hello world :: " + i));
//
//        IntStream.rangeClosed(1, 10)
//                .forEach(i -> System.out.println("Hello world :: " + i));


//        Integer bigInt = 5;
//        int b = bigInt;
//
//        long c = 4;
//        int d = (int) c;

//        list.stream()
//                .mapToLong(a -> a)
//                .mapToInt(a -> (int) a)
//                .sum();


//        final int sum = list.stream()
//                .mapToInt(a -> a)
//                .sum();
//
//        System.out.println(sum);


//        final int sum = 0;
//        for (int i : list) {
//            sum = sum + i;
//        }


//        final Optional<Integer> reduce = list.stream()
//                .reduce((a, b) -> a + b);

//        final Optional<Integer> reduce = list.stream()
//                .reduce((a, b) -> {
//                    System.out.println(a + "::" + b);
//                    return a + b;
//                });
//
//        System.out.println(reduce.get());

    }
}
