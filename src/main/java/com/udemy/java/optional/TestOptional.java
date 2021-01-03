package com.udemy.java.optional;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Stream;

public class TestOptional {

    private static Optional<String> getSmallest(String var1, String var2, String var3) {
        //some algo.to find smallest
//        return Optional.ofNullable(null);
        return Stream.of(var1, var2, var3)
                .min(Comparator.naturalOrder());
    }


    public static void main(String[] args) {

        Optional<Integer> op = Stream.of(1, 2, 3, 4)
                .filter(i -> i > 5)
                .findFirst();

        System.out.println(op.isPresent());

//        String a = "Ball";
//        String b = "Delta";
//        String c = "Apple";
//
//        final Optional<String> smallest = getSmallest(a, b, c);
//
//        if (smallest.isPresent())
//            System.out.println(smallest.get().toUpperCase());
//        else
//            System.out.println("no value found");

//        int[] d = new int[] {3, 4, 6, 1};

//        System.out.println(
//
//                Stream.of(a, b, c)
//                        .min(Comparator.naturalOrder())
//
//        );


//        System.out.println(
//
//                Arrays.stream(d)
//                        .count()
//
//        );

    }
}
