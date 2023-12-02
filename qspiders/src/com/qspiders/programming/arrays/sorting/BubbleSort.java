package com.qspiders.programming.arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {9,2,-1,3,-2,4,6,1,0,5,8,45,22,13,48,90,4,3,7};
		int[] res=sort(arr);
		System.out.println(Arrays.toString(res));
	}
	public static int[] sort(int arr[]) {
		int[] res=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		copy(arr,res);
		return res;
	}
	public static void copy(int arr1[],int arr2[]) {
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[i];
		}
	}
}
