package com.qspiders.programming.arrays;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp=arr[i];
			int j=i;
			
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {3,4,2,1,5,8,6};
		insertionSort(arr);
		sort(arr);
	}
	public static void sort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp=arr[i];
			int j=i;
			shift(arr,j,j-1);
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void shift(int arr[],int j,int k) {
		while(j>0 && arr[j]<arr[k]) {
			arr[j]=arr[k];
			j--;
		}
	}
}
