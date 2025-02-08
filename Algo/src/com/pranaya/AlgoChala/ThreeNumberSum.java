package com.algochala.ArraysExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static void main(String[] args) {
        int[] array = new int[]{12, 3, 1, 2, -6, 5, -8, 61, 6};
        int targetSum = 0;
        System.out.println(Arrays.deepToString(threeNumberSum(array, targetSum).toArray()));
    }

    public static List<int[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int targetTwoSum = targetSum - array[i];
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[left] + array[right];
                if (currentSum == targetTwoSum) {
                    int[] solution = new int[3];
                    solution[0] = array[i];
                    solution[1] = array[left];
                    solution[2] = array[right];
                    result.add(solution);
                    left++;
                    right--;
                } else if (currentSum > targetTwoSum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}
