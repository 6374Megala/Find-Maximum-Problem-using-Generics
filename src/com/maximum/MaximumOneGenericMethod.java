package com.maximum;

public class MaximumOneGenericMethod {
    public static <K extends Comparable<K>> K findMaximum(K x, K y, K z) {
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
        System.out.println("Test case 1 (Integers): " + findMaximum(5, 2, 4));
        System.out.println("Test case 2 (Integers): " + findMaximum(3, 7, 5));
        System.out.println("Test case 3 (Integers): " + findMaximum(8, 6, 9));

        System.out.println("Test case 1 (Floats): " + findMaximum(5.5f, 3.2f, 4.8f));
        System.out.println("Test case 2 (Floats): " + findMaximum(1.1f, 7.7f, 2.2f));
        System.out.println("Test case 3 (Floats): " + findMaximum(8.3f, 6.6f, 9.9f));

        System.out.println("Test case 1 (Strings): " + findMaximum("Apple", "Peach", "Banana"));
        System.out.println("Test case 2 (Strings): " + findMaximum("Orange", "Grapes", "Mango"));
        System.out.println("Test case 3 (Strings): " + findMaximum("Cherry", "Strawberry", "Blueberry"));
    }
}
