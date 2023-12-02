package com.qspiders.programming.arrays;

public class PrintSecondLargestElement {
	public static int secondLargest(int arr[]) {
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				second=largest;
				largest=arr[i];
			}else if(arr[i]>second&&arr[i]!=largest) {
				second=arr[i];
			}
		}
		return second;
	}
	public static void main(String[] args) {
		int arr2[]= {56,-1,-3,-5,7,8,10};
		System.out.println("Second Largest Number "+secondLargest(arr2));
	}
}
