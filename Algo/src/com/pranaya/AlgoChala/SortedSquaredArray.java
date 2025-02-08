package com.algochala.ArraysExample;

import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        //array = [1, 2, 3, 5, 6, 8, 9]
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(sortedSquaredArray(array)));
    }

    /*private static int[] sortedSquaredArray(int[] array) {
        return Arrays.stream(array)
                .map(operand -> {
                    if (operand < 0) operand = operand * -1;
                    return operand;
                })
                .sorted()
                .map(value -> value * value)
                .toArray();
    }*/

    /*
    Time O(1) and space O(1)
     */
    private static int[] sortedSquaredArray(int[] array) {
        int pivot = getFirstPositivePosition(array);
        int left = pivot - 1, right = pivot;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int leftValue = left < 0 ? Integer.MAX_VALUE : array[left] * array[left];
            int rightValue = right >= array.length ? Integer.MAX_VALUE : array[right] * array[right];
            if (leftValue >= rightValue) {
                result[i] = rightValue;
                right++;
            } else {
                result[i] = leftValue;
                left--;
            }
        }
        return result;
    }

    private static int getFirstPositivePosition(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                return i;
            }
        }
        return array.length - 1;
    }
}
