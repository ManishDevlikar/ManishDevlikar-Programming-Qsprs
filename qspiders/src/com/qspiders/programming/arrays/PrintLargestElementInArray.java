package com.qspiders.programming.arrays;

public class PrintLargestElementInArray {
	public static int larget(int arr[]) {
		int largest=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			
		}
		return largest;
	}
	public static void main(String[] args) {
		int arr2[]= {56,-1,-3,-5,7,8,10};
		System.out.println("Largest Number 	"+larget(arr2));
	
	}
}
