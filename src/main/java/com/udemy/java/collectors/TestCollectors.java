package com.udemy.java.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestCollectors {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Apple");
        list.add("Airplane");
        list.add("Ball");
        list.add("Boy");
        list.add("Cat");
        list.add("Dog");
        list.add("Delta");

        final Map<Character, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

//        final Map<Integer, List<String>> map = list.stream()
//                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(map);

//        final String joinedString = list.stream()
//                .filter(s -> s.length() > 3)
//                .collect(Collectors.joining(";"));

//        final Set<String> newSet = list.stream()
//                .filter(s -> s.length() > 3)
//                .collect(Collectors.toSet());

//        final List<String> newList = list.stream()
//                .filter(s -> s.length() > 3)
//                .collect(Collectors.toList());

//        System.out.println(joinedString);
//        System.out.println("Original :: " + list);
//        System.out.println("New Set :: " + newSet);
//        System.out.println("New List :: " + newList);

    }
}
