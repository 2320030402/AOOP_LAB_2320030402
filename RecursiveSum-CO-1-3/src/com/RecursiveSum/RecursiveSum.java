package com.RecursiveSum;

import java.util.Scanner;

public class RecursiveSum {

    // Recursive function to calculate sum of an array
    public static int sumArray(int[] arr, int n) {
        // Base case: if no elements are left, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: sum of last element and rest of array
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        // Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Read array elements from user input
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Call the recursive sum function and display the result
        int result = sumArray(array, size);
        System.out.println("The sum of the array is: " + result);

        // Close the scanner
        scanner.close();
    }
}
