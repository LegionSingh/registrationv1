package com.api;

public class BinarySearch {

    public static void main(String[] args) {

        int init[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,11};

        System.out.println(binarySearch(init, 10));


    }

    private static int binarySearch(int[] numbers, int numberToFind) {
         int low = 0;
         int high = numbers.length-1;

         while (low <= high) {
             int middlePosition = (low + high)/2;
             int middleNumber = numbers[middlePosition];

             if (numberToFind == middleNumber) {
                 return middlePosition;
             }
             if (numberToFind < middleNumber) {
                 high = middlePosition-1;

             }
             else {
                 low = middlePosition+1;
             }

         }
        return -1;
    }

}
