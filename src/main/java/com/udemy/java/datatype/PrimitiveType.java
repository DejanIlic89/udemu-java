package com.udemy.java.datatype;

public class PrimitiveType {

    public static void main(String[] args) {

        int i = 5;

        System.out.println("Before :: " + i);

        //kopiranje vrednosti - prosledjivanje parametara po vrednosti
        change(i);

        System.out.println("After :: " + i);

    }

    private static void change(int a) {
        a++; //a=a+1
    }


}
