package com.StreamPipelineExample;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Create a stream pipeline to filter, double even numbers, and collect them into a list
        List<Integer> processedList = integerList.stream()
                .filter(n -> n % 2 == 0)   // Filter even numbers
                .map(n -> n * 2)           // Double the even numbers
                .collect(Collectors.toList()); // Collect the result into a new list

        // Print the result
        System.out.println("Processed list (even numbers doubled): " + processedList);
    }
}
