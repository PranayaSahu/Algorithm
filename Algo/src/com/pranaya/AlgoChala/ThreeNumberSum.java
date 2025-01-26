package com.algochala.ArraysExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static void main(String[] args) {
        int[] array = new int[]{12, 3, 1, 2, -6, 5, -8, 61, 6};
        int targetSum = 0;
        Arrays.sort(array);
        System.out.println(Arrays.deepToString(threeNumberSum(array, targetSum)));
    }

    public static int[][] threeNumberSum(int[] array, int targetSum) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int targetTwoSum = targetSum - array[i];
            var twoSumResult = twoNumberSum(array, targetTwoSum, i + 1, array.length - 1);
            if (!twoSumResult.isEmpty()) {
                int firstvalue = array[i];
                twoSumResult.forEach(integers -> {
                    integers.addFirst(firstvalue);
                    result.add(integers.stream().mapToInt(Integer::intValue).toArray());
                });
            }
        }
        int[][] returnValue = new int[result.size()][3];
        for(int j=0; j< result.size();j++){
            returnValue[j] = result.get(j);
        }
        return returnValue;
    }

    public static List<List<Integer>> twoNumberSum(int[] array, int targetSum, int firstIndex, int secondIndex) {
        List<List<Integer>> returnValues = new ArrayList<>();
        while (firstIndex < secondIndex) {
            if ((array[firstIndex] + array[secondIndex]) == targetSum) {
                var solution = new ArrayList<Integer>();
                solution.add(array[firstIndex]);
                solution.add(array[secondIndex]);
                returnValues.add(solution);
                firstIndex++;
                secondIndex--;
            } else if ((array[firstIndex] + array[secondIndex]) > targetSum) {
                secondIndex--;
            } else {
                firstIndex++;
            }
        }
        return returnValues;
    }
}
