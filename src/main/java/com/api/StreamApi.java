package com.api;

public class StreamApi {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 23, 56, 89, 34};
        int largest = findLargest(numbers);
        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}