package com.javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberListSort {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();

        // Add different types of numbers
        numberList.add(10);        // Integer
        numberList.add(5.5);       // Double
        numberList.add(3L);        // Long
        numberList.add(7.2f);      // Float
        numberList.add((short) 2); // Short

        // Sort the list by converting each Number to double
        Collections.sort(numberList, new Comparator<Number>() {
            public int compare(Number n1, Number n2) {
                return Double.compare(n1.doubleValue(), n2.doubleValue());
            }
        });

        // Print the sorted list
        System.out.println("Sorted Numbers:");
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}

