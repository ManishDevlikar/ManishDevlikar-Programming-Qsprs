package com.qspiders.programming.arrays;

public class PrintThreeDigitsToReturnsum {
	public static void getElements(int arr[],int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
					
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		getElements(arr,9);
		System.out.println("----------------");
		getElementss(arr,9);
	}
	public static void getElementss(int arr[],int target) {
		for (int i = 0; i < arr.length-2; i++) {
			if(arr[i]+arr[i+1]+arr[i+2]==target) {
				System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
			}
		}
	}
}
