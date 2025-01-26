package com.algochala.ArraysExample;

import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        //array = [1, 2, 3, 5, 6, 8, 9]
        int[] array = new int[]{-10, 1, 2, 3, 5, 6, 8, 9};
        System.out.println(Arrays.toString(sortedSquaredArray(array)));
    }

    private static int[] sortedSquaredArray(int[] array) {
        return Arrays.stream(array)
                .map(operand -> {
                    if (operand < 0) operand = operand * -1;
                    return operand;
                })
                .sorted()
                .map(value -> (int) Math.pow(value, 2))
                .toArray();
    }
}
