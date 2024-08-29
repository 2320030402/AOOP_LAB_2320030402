package com.minmax;

public class Main {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {3, 6, 2, 8, 4, 1};
        MinMax<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array:");
        System.out.println("Min: " + intMinMax.min(intArray));
        System.out.println("Max: " + intMinMax.max(intArray));

        // String array
        String[] strArray = {"apple", "orange", "banana", "pear", "grape"};
        MinMax<String> strMinMax = new MinMaxImpl<>();
        System.out.println("\nString Array:");
        System.out.println("Min: " + strMinMax.min(strArray));
        System.out.println("Max: " + strMinMax.max(strArray));

        // Character array
        Character[] charArray = {'a', 'x', 'm', 'd', 'z'};
        MinMax<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("\nCharacter Array:");
        System.out.println("Min: " + charMinMax.min(charArray));
        System.out.println("Max: " + charMinMax.max(charArray));

        // Float array
        Float[] floatArray = {2.5f, 1.5f, 3.7f, 0.8f, 4.1f};
        MinMax<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("\nFloat Array:");
        System.out.println("Min: " + floatMinMax.min(floatArray));
        System.out.println("Max: " + floatMinMax.max(floatArray));
    }
}
