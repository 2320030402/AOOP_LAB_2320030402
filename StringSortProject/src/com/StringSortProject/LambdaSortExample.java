package com.StringSortProject;

import java.util.ArrayList;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("pear");
        stringList.add("orange");

        // Sort the list in descending order using a lambda expression
        stringList.sort((s1, s2) -> s2.compareTo(s1));

        // Print the sorted list
        System.out.println("Sorted list in descending order:");
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
