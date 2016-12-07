package com.pranaya.algo;

import com.pranaya.common.Sort;

public class quickSortTest {
	private int[] numbers;
	private int number;

	public void sort(int[] values) {
		if (values == null || values.length == 0) {
			return;
		}
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		int pivot = numbers[low + (high - low) / 2];

		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}
			while (numbers[j] > pivot) {
				j--;
			}

			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	public static void main(String[] args) {
		quickSortTest sort=new quickSortTest();
		int array[]={1,3,2,4,5,6,21,58,10,12,0};
		for(int i:array){
			System.out.print(i+"  ");
		}
		System.out.println();
		sort.sort(array);
		for(int i:array){
			System.out.print(i+"  ");
		}
	}
}