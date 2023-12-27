package com.maximum;

public class MaxFinder_UC2<K extends Comparable<K>>{
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
        MaxFinder_UC1<Float> floatMaxFinder = new MaxFinder_UC1<>();
        System.out.println("Float Test Cases:");
        System.out.println("Test case 1: " + floatMaxFinder.findMax(6.5f, 3.6f, 1.5f));
        System.out.println("Test case 2: " + floatMaxFinder.findMax(5.2f, 9.8f, 3.6f));
        System.out.println("Test case 3: " + floatMaxFinder.findMax(7.6f, 4.4f, 12.3f));
    }

}
