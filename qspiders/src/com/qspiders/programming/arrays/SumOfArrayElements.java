package com.qspiders.programming.arrays;

public class SumOfArrayElements {
	public static int sum(int arr[]) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res+=arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sum(arr));
	}
}
