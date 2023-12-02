package com.cycle.sort;

import java.util.Arrays;

// given an array nums containing n distinct numbers in the range [0 to n] return only numbers in the range that is missing from the array 
public class MissingNumbers {
	static int missingNumber(int[] arr) {
		int i=0;
		while(i<arr.length) {
		int correct=arr[i];
			if(arr[i]<arr.length && arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
			}
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=index) {
				return index;
			}
		}
		return arr.length;
	}
	static void swap(int[] arr,int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	public static void main(String[] args) {
		int[] arr={2,0,1};
		
		System.out.println(arr[0]);
		System.out.println(missingNumber(arr));
		System.out.println(arr.length);
	}
}
