package com.maximum;

public class MaximumGenericClass<K extends Comparable<K>>{
    private K a,b,c;
    public MaximumGenericClass(K a,K b,K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Static generic method to find the maximum of three values
    public static <K extends Comparable<K>> K findMaximum(K a,K b,K c) {
        K max = a; // Assume x is the maximum initially

        if (b.compareTo(max) > 0) {
            max = b; // Update max if y is greater
        }

        if (c.compareTo(max) > 0) {
            max = c; // Update max if z is greater
        }

        return max;
    }
    public K testMaximum() {
        return findMaximum(a,b,c);
    }

    public static void main(String[] args) {
        // Test case for integers
        MaximumGenericClass<Integer> intMax = new MaximumGenericClass<>(5, 3, 4);
        System.out.println("Test case 1 (Integers): " + intMax.testMaximum());

        MaximumGenericClass<Integer> intMax2 = new MaximumGenericClass<>(1, 7, 2);
        System.out.println("Test case 2 (Integers): " + intMax2.testMaximum());

        MaximumGenericClass<Integer> intMax3 = new MaximumGenericClass<>(8, 6, 9);
        System.out.println("Test case 3 (Integers): " + intMax3.testMaximum());

        // Test case for floats
        MaximumGenericClass<Float> floatMax = new MaximumGenericClass<>(5.5f, 3.2f, 4.8f);
        System.out.println("Test case 1 (Floats): " + floatMax.testMaximum());

        MaximumGenericClass<Float> floatMax2 = new MaximumGenericClass<>(1.1f, 7.7f, 2.2f);
        System.out.println("Test case 2 (Floats): " + floatMax2.testMaximum());

        MaximumGenericClass<Float> floatMax3 = new MaximumGenericClass<>(8.3f, 6.6f, 9.9f);
        System.out.println("Test case 3 (Floats): " + floatMax3.testMaximum());

        // Test case for strings
        MaximumGenericClass<String> strMax = new MaximumGenericClass<>("Apple", "Peach", "Banana");
        System.out.println("Test case 1 (Strings): " + strMax.testMaximum());

        MaximumGenericClass<String> strMax2 = new MaximumGenericClass<>("Orange", "Grapes", "Mango");
        System.out.println("Test case 2 (Strings): " + strMax2.testMaximum());

        MaximumGenericClass<String> strMax3 = new MaximumGenericClass<>("Cherry", "Strawberry", "Blueberry");
        System.out.println("Test case 3 (Strings): " + strMax3.testMaximum());
    }

}
