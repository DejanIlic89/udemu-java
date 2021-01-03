package com.udemy.java.assignment1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestAssignment1 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/first-names.txt");
        final List<String> list = Files.readAllLines(path);

        // Print the count of names which start with B
//        final long count = list.stream()
//                .filter(s -> s.startsWith("B"))
//                .count();
//        System.out.println(count);


        // Create a list of names which start with C and contains 's' in it
//        final List<String> stringList = list.stream()
//                .filter(s -> s.startsWith("C"))
//                .filter(s -> s.toLowerCase().contains("s"))
//                .collect(Collectors.toList());
//        System.out.println(stringList.size());


        // Print the total number of chars for all the names starting with M
//        final int sum = list.stream()
//                .filter(s -> s.startsWith("M"))
//                .map(String::trim)
//                .map(String::length)
//                .mapToInt(a -> a)
//                .sum();
//        System.out.println(sum);


        //Find the names containing '-' in it and replace it with a space; collect them into a list = Jo-Ann > Jo Ann
//        final List<String> names = list.stream()
//                .filter(name -> name.contains("-"))
//                .map(name -> name.replaceAll("-", " "))
//                .collect(Collectors.toList());
//        System.out.println(names);


        //Find the name witch has more number of chars = Anna bob -> Anna
//        final String s = list.stream()
//                .max(Comparator.comparing(String::length))
//                .get();
//        System.out.println(s);

    }
}
