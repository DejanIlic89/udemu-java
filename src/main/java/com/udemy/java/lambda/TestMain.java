package com.udemy.java.lambda;

import com.udemy.java.lambda.GreetingService;
import com.udemy.java.lambda.StringOperations;

import java.util.Objects;

public class TestMain {
    public static void main(String[] args) {

        StringOperations ss = Objects::isNull;
        

        System.out.println(ss.accept("data"));

//        GreetingService g1 = (n) -> n.toUpperCase();

//        GreetingService g1 = new GreetingService() {
//            @Override
//            public String greet(String firstName) {
//                return firstName.toUpperCase();
//            }
//        };

//        test((n) -> n.toUpperCase() + n.toLowerCase() + n.length());
//        test(a -> a.substring(1));
    }

    private static void test(GreetingService g) {
        final String returnedString = g.greet("udemy");
        System.out.println(returnedString);
    }
}
