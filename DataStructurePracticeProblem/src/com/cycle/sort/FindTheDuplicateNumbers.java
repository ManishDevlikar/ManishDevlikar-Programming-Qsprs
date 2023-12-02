package com.cycle.sort;

import java.util.Arrays;

public class FindTheDuplicateNumbers {
	static int findDuplicates(int[] arr) {
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=i+1) {
				int correctIndex=arr[i]-1;//index it will have the value of index
				if(arr[i]!=arr[correctIndex]) { // checks value at index
					swap(arr,i,correctIndex);
				}else {
				return arr[i];
				}
			}else {
				i++;
			}
		
		}
		return -1;
	}
	static void swap(int[] arr,int i,int correctIndex) {
		int temp=arr[i];
		arr[i]=arr[correctIndex];
		arr[correctIndex]=temp;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		System.out.println(findDuplicates(arr));
		System.out.println(arr[1]);
		System.out.println(arr[1]-1);
	}
}
