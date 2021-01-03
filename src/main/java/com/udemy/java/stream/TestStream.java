package com.udemy.java.stream;

import java.util.ArrayList;
import java.util.List;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        // check for even numbers
        // interested in only 3 elements
        // find the square
        // print it on the console one by one - new line

//        int k = 0;
//        for (int i = list.get(0); i < list.size(); i++) {
//            if (i % 2 == 0) {
//                k++;
//                System.out.println(i * i);
//            }
//            if (k == 3) break;
//        }

//        list.stream()
//                .filter(i -> {
//                    System.out.println("Filter :: received " + i);
//                    return i % 2 == 0;
//                })
//                .limit(3)
//                .map(i -> {
//                    System.out.println("Map :: reveived " + i);
//                    return i * i;
//                })
//                .forEach(System.out::println);

//        list.stream()
//                .filter(i -> i % 2 == 0)
//                .limit(3)
//                .map(i -> i * i)
//                .forEach(System.out::println);

//        list.stream()
//                .peek(i -> System.out.println("Filter - received :: " + i))
//                .filter(i -> i % 2 == 0)
//                .limit(3)
//                .peek(i -> System.out.println("Map - received :: " + i))
//                .map(i -> i * i)
//                .skip(2)
//                .forEach(System.out::println);

        // check for even numbers
        // ensure that number > 5
        // find the square and add 2 to that
        // print it on the console one by one - new line

        list.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> i > 5)
                .map(i -> i * i + 2)
                .forEach(System.out::println);

    }
}
