package com.udemy.java.defaultMethods;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        CustomList list = new CustomArrayList();

        list.add(1);
        list.add(2);
        list.add(3);


        list.forEach(System.out::println);
    }
}
