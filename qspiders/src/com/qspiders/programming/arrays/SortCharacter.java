package com.qspiders.programming.arrays;

import java.util.Arrays;

public class SortCharacter {
	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int low=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[low]) {
					low=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[low];
			arr[low]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {3,2,1,5,4,9,7,8,6};
		char[] charArr= {'M','A','N','I','S','H'};
		selectionSort(arr);
		selectionSort(charArr);
	}
	public static void selectionSort(char arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int low=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[low]) {
					low=j;
				}
			}
			char temp=arr[low];
			arr[low]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
