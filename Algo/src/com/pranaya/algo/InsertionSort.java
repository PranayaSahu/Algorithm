package com.pranaya.algo;

import com.pranaya.common.Sort;

public class InsertionSort implements Sort{

	public void sort(int[] array){
		for(int i=1;i<array.length;i++){
			int j=i-1;
			int key=array[i];
			while(j>=0 && (key<array[j])){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
	}
	public static void main(String[] args) {
		int[] array={1,4,3,6,7,10,55,21,45,60,0};
		Sort InsertionSort= new InsertionSort();
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		InsertionSort.sort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
