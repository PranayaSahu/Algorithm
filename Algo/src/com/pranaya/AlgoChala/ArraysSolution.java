package com.algochala.ArraysExample;

import java.util.Arrays;

public class ArraysSolution {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, -4, 2, 11, 1, -1, 61};
        int targetSum = -10;
        System.out.println(Arrays.toString(twoNumberSum_solution2(array, targetSum)));
    }

    public static int[] twoNumberSum_solution2(int[] array, int targetSum) {
        Arrays.sort(array); //log n
        int firstIndex = 0;
        int secondIndex = array.length - 1;
        int[] solution = new int[0];
        while (firstIndex < secondIndex) {
            if ((array[firstIndex] + array[secondIndex]) == targetSum) {
                solution = new int[2];
                solution[0] = array[firstIndex];
                solution[1] = array[secondIndex];
                return solution;
            } else if ((array[firstIndex] + array[secondIndex]) > targetSum) {
                secondIndex--;
            } else {
                firstIndex++;
                //secondIndex = array.length - 1;
            }
        }
        return solution;
    }

    public static int[] twoNumberSum_solution1(int[] array, int targetSum) {
        int[] solution = new int[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == targetSum) {
                    solution = new int[2];
                    solution[0] = array[i];
                    solution[1] = array[j];
                    return solution;
                }
            }
        }
        return solution;
    }
}
