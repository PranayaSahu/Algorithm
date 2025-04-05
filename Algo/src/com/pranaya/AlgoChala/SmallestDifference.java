package com.algochala.ArraysExample;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int arrayOneIndex = 0, arrayTowIndex = 0;
        int[] returnValue = null;
        int smallestAB = Integer.MAX_VALUE;
        while (arrayOneIndex < arrayOne.length && arrayTowIndex < arrayTwo.length) {
            int firstValue = arrayOne[arrayOneIndex];
            int secondValue = arrayTwo[arrayTowIndex];
            int ad = Math.abs(firstValue - secondValue);
            if (firstValue < secondValue) {
                arrayOneIndex++;
            } else if (firstValue > secondValue) {
                arrayTowIndex++;
            } else {
                returnValue = new int[]{firstValue, secondValue};
                break;
            }
            if (smallestAB > ad) {
                smallestAB = ad;
                returnValue = new int[]{firstValue, secondValue};
            }
        }
        return returnValue;
    }

    public static void main(String[] args) {
        int[] arrayOne = new int[]{-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = new int[]{26, 134, 135, 15, 17};
        System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));
    }
}
