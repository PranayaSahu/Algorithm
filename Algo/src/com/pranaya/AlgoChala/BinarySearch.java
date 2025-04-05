package com.algochala.ArraysExample;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 5, 10, 20, 28, 3, 11};
        Arrays.sort(inputArray);
        System.out.println(binarySearch(inputArray, 5));
    }

    public static boolean binarySearch(int[] inputArray, int searchValue) {
        int startIndex = 0, endIndex = (inputArray.length - 1);
        boolean returnValue = false;
        while (startIndex <= endIndex) {
            int midValue = Math.abs((startIndex + endIndex) / 2);
            if (inputArray[midValue] == searchValue) {
                returnValue = true;
                break;
            } else if (inputArray[midValue] < searchValue) {
                startIndex = midValue + 1;
            } else {
                endIndex = midValue - 1;
            }
        }
        return returnValue;
    }
}
