package com.udemy.java.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TestComparator {
    public static void main(String[] args) {

//        Student a = new Student("Adam", 80, 150);
//        Student b = new Student("Bob", 96, 123);
//        Student c = new Student("Carl", 75, 135);
//
//        final Optional<Student> op = Stream.of(a, b, c)
//                .min(Comparator.comparing(Student::getScore));
//
//        System.out.println(op.get());


//        int[] numbers = new int[] {3, 4, 1, 5, 2};
//
        String a = "apple";
        String b = "ball";
        String c = "cat";
        String d = "baby";


        System.out.println(

                Stream.of(a, b, c, d)
                        .max(Comparator.reverseOrder())

//                Stream.of(a, b, c, d)
//                        .max(Comparator.naturalOrder())

        );

    }
}
