package com.recursion.patternAndSort;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
	static void bubbleSort(int [] arr,int row,int col) {
		if(row==0) {
			return;
		}
		if(col<row) {
			if(arr[col]>arr[col+1]){
				int temp=arr[col];
				arr[col]=arr[col+1];
				arr[col+1]=temp;
			}
			bubbleSort(arr,row,col+1);
		}else {
			bubbleSort(arr,row-1,0);
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {1,3,2,4,6,5};
		bubbleSort(arr,arr.length-1,0);
		System.out.println(Arrays.toString(arr));
	}
}
