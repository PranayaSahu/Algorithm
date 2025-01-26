package com.algochala.ArraysExample;

public class ValidateSubsequence {
    public static void main(String[] args) {
        int[] firstArray = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        int[] secondArray = new int[]{1, 6, -1, 10};

        System.out.println(validateSubsequence(firstArray, secondArray));
    }

    private static boolean validateSubsequence(int[] primaryArray, int[] subArray) {
        boolean returnValue = true;
        int primaryArrayIndex = 0;
        int subArrayIndex = 0;
        while (primaryArrayIndex < primaryArray.length
                && subArrayIndex < subArray.length) {
            if (primaryArray[primaryArrayIndex] == subArray[subArrayIndex]) {
                primaryArrayIndex++;
                subArrayIndex++;
            } else {
                primaryArrayIndex++;
            }
        }
        if(subArrayIndex == subArray.length) return true;
        else return false;
    }

}
