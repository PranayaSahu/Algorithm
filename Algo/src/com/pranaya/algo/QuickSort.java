package com.pranaya.algo;

import com.pranaya.common.Sort;

public class QuickSort implements Sort {

	public static void main(String[] args) {

		Sort sort=new QuickSort();
		int array[]={1,3,2,4,5,6,21,58,10,12,0};
		//int array[]={2,8,7,1,3,5,6,4};
		for(int i:array){
			System.out.print(i+"  ");
		}
		System.out.println();
		sort.sort(array);
		for(int i:array){
			System.out.print(i+"  ");
		}
	
	}
	public void sort(int[] array) {
		this.quickSort(array,0,array.length-1);
	}
	public void quickSort(int[] array,int left,int right){
		if(right<=left)return;
		int pivot = partation(array,left,right);
		quickSort(array,left,pivot-1);
		quickSort(array,pivot+1,right);
	}
	public int partation(int[] array,int left,int right){
		int x = array[right];
		int i = left-1;
		for(int j=left;j<=(right-1);j++){
			if(array[j]<=x){
				i++;
				exchange(array,i,j);
			}
		}
		exchange(array,i+1,right);
		return i+1; 
		/*
		System.out.print("Before: ");
		for(int i:array){
			System.out.print(i+"  ");
		}
		System.out.println();
		int pivot=array[left];
		System.out.println("Pivot value:"+pivot+" leftvalue:"+array[left]+" rightvalue:"+array[right]);
		int leftMark=left+1;
		int rightMark=right;
		boolean done=true;
		while(leftMark<rightMark){
				while(leftMark<right && array[leftMark]<pivot){
					leftMark++;
				}
				while(rightMark>left && pivot<array[rightMark]){
					rightMark--;
				}
			
			if(leftMark<=rightMark){
				int temp=array[leftMark];
				array[leftMark]=array[rightMark];
				array[rightMark]=temp;
				leftMark++;
				rightMark--;
			}
		}
		array[left]=array[leftMark-1];
		array[leftMark-1]=pivot;
		System.out.print("after: ");
		for(int i:array){
			System.out.print(i+"  ");
		}
		System.out.println("\n");
		return leftMark-1;
	*/}
	private void exchange(int[] array, int i, int j) {
		int temp= array[i];
		array[i]= array[j];
		array[j]= temp;
		
	}
}
