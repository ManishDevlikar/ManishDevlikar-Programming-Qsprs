package com.qspiders.programming.arrays;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {3,2,1,5,4,9,7,8,6};
		selectionSort(arr);
	}
}
