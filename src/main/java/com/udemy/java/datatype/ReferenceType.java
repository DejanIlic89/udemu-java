package com.udemy.java.datatype;

import java.util.Arrays;

public class ReferenceType {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        System.out.println("Before :: " + Arrays.toString(arr));
//        System.out.println("Before :: " + arr);
        change(arr);
        System.out.println("After :: " + Arrays.toString(arr));
//        System.out.println("After :: " + arr);

    }
 // prosledjivanje parametara po referenci
    private static void change(int[] a) {
//        a = new int[]{5, 6, 7};
        a[0]++;
        a[1]++;
        a[2]++;
    }

}
