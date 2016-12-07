package com.pranaya.algo;

import com.pranaya.common.Sort;

public class MergeSort implements Sort {

	public void sort(int[] array) {
		if(array.length==1){
			return;
		}else{
			int mid= array.length/2;
			int []left = new int[mid];
			int []right = new int[array.length-mid];
			for(int i=0;i<mid;i++){
				left[i]=array[i];
			}
			for(int i=mid;i<array.length;i++){
				right[i-mid]=array[i];
			}
			sort(left);
			sort(right);
			int mainCount=0,leftCount=0,rightCount=0;
			while(mainCount<array.length){
				if(leftCount>=left.length){
					array[mainCount]=right[rightCount];
					mainCount++;
					rightCount++;
				}else if(rightCount>=right.length){
					array[mainCount]=left[leftCount];
					mainCount++;
					leftCount++;
				}else if(left[leftCount]<right[rightCount]){
					array[mainCount]=left[leftCount];
					mainCount++;
					leftCount++;
				}else{
					array[mainCount]=right[rightCount];
					mainCount++;
					rightCount++;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		Sort sort=new MergeSort();
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
