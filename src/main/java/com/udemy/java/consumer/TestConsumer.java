package com.udemy.java.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("dejan");
        list.add("ilic");

        Consumer<String> dbConsumer = (s) -> {
            System.out.println("I am writing into DB :: " + s);
        };

        Consumer<String> loggingConsumer = (s) -> {
            System.out.println("I am writing into log file :: " + s);
        };

        Consumer<String> dbLogConsumer = dbConsumer.andThen(loggingConsumer);





//        BiConsumer<String, Integer> biConsumer = (s, i) -> {
//            System.out.println("My name :: " + s);
//            System.out.println("My age :: " + i);
//        };



//        biConsumer.accept("dejan", 31);

//        Map<String, Consumer<String>> map = new HashMap<>();
//
//        map.put("db", dbConsumer);
//        map.put("log", loggingConsumer);
//        map.put("dblog", dbLogConsumer);
//
//        map.forEach((k, v) -> {
//            System.out.println("Key is :: " + k);
//        });

//        list.forEach(map.get("dblog"));

//        list.forEach(dbLogConsumer);

//        Consumer<String>  c1 = s -> System.out.println(s);

//        c1.accept("udemy");

//        list.forEach(System.out::println);
//        list.forEach(c1);
//        list.forEach(s -> System.out.println(s.toUpperCase()));

    }
}
