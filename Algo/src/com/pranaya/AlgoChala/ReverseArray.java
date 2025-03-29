package com.algochala.ArraysExample;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 2, 3, 5, 6, 8, 9, 10};
        System.out.println("Input : " + Arrays.toString(inputArray));
        System.out.println("Output : "+ Arrays.toString(reverse(inputArray)));
    }

    public static int[] reverse(int[] inputArray){
        int left = 0;
        int right = inputArray.length -1 ;
        int temp;
        while(left<right){
            temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;

            left ++;
            right --;
        }
        return inputArray;
    }
}
