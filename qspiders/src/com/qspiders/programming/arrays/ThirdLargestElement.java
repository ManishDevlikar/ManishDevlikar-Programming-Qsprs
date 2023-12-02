package com.qspiders.programming.arrays;

import java.util.Arrays;

public class ThirdLargestElement {
	public static int thirdLargest(int arr[]) {
		int firstLargest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		int thirdLargest=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>firstLargest) {
				thirdLargest=secondLargest;
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}else if(arr[i]>secondLargest&&arr[i]!=firstLargest) {
				thirdLargest=secondLargest;
				secondLargest=arr[i];
			}else if(arr[i]>thirdLargest&&arr[i]!=firstLargest&&arr[i]!=secondLargest) {
				thirdLargest=arr[i];
			}
		}
		return thirdLargest;
	}
	public static void main(String[] args) {
		int[] arr= {-2,-3,-4,-1,-5,-6,-7,0};
		System.out.println("ThirdLargest "+ thirdLargest(arr));
	}
}
