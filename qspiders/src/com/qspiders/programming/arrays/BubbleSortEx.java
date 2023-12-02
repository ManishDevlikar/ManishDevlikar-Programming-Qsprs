package com.qspiders.programming.arrays;

import java.util.Arrays;

public class BubbleSortEx {
	public static void main(String[] args) {
		int arr[]= {2,6,5,4,8};
		System.out.println("Array Before Sorting"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array After Sorting"+Arrays.toString(arr));
	}
}
