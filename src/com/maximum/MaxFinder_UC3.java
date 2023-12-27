package com.maximum;

public class MaxFinder_UC3<K extends Comparable<K>>{
    public  K findMax(K x, K y, K z) {
        K max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxFinder_UC1<String> stringMaxFinder = new MaxFinder_UC1<>();
        System.out.println("String Test Cases:");
        System.out.println("Test case 1: " + stringMaxFinder.findMax("Apple", "Peach", "Banana"));
        System.out.println("Test case 2: " + stringMaxFinder.findMax("Orange", "Grapes", "Kiwi"));
        System.out.println("Test case 3: " + stringMaxFinder.findMax("Cherry", "Mango", "Watermelon"));
    }
}
