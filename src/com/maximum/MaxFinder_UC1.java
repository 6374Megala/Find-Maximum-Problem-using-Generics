package com.maximum;

public class MaxFinder_UC1<K extends Comparable<K>>{
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
        MaxFinder_UC1<Integer> intMaxFinder = new MaxFinder_UC1<>();
        System.out.println("Integer Test Cases:");
        System.out.println("Test case 1: " + intMaxFinder.findMax(5, 3, 1));
        System.out.println("Test case 2: " + intMaxFinder.findMax(4, 9, 2));
        System.out.println("Test case 3: " + intMaxFinder.findMax(8, 6, 15));
    }
}
