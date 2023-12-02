package com.qspiders.programming.arrays;

public class PrintSmallestElementInArray {
	public static int smallest(int arr[]) {
		int small=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
			
		}
		return small;
	}
	public static void main(String[] args) {
		int arr2[]= {56,-1,-3,-5,7,8,10};
		System.out.println("smallest Number "+smallest(arr2));
	
	}
}
