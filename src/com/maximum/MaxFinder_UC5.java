package com.maximum;

public class MaxFinder_UC5<K extends Comparable<K>> {
    private K[] values;
    public MaxFinder_UC5(K... values) {
        this.values = values;
    }
    public static <K extends Comparable<K>> K findMaximum(K... values) {
        if (values == null || values.length == 0) {
            System.out.println("At least one value must be provided");
        }

        K max = values[0];

        for (K value : values) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }
    public static <K extends Comparable<K>> void printMax(K max) {
        System.out.println("Maximum Value: " + max);
    }
    public K testMaximum() {
        //return findMaximum(values);
        K max = findMaximum(values);
        printMax(max);
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Test case 1 (Integers): " + findMaximum(5, 3, 4));

        System.out.println("Test case 1 (Floats): " + findMaximum(5.5f, 3.2f, 4.8f));


        System.out.println("Test case 1 (Strings): " + findMaximum("Apple", "Peach", "Banana"));


        System.out.println("Test case 2 (More than three parameters): " +
                findMaximum(10, 8, 15, 25, 12, 7, 18));

        MaxFinder_UC5<Integer> intMax = new MaxFinder_UC5<>(5, 3, 4);
        intMax.testMaximum();

        MaxFinder_UC5<Float> floatMax = new MaxFinder_UC5<>(5.5f, 3.2f, 4.8f);
        floatMax.testMaximum();

        MaxFinder_UC5<String> strMax = new MaxFinder_UC5<>("Apple", "Peach", "Banana");
        strMax.testMaximum();

    }

}
