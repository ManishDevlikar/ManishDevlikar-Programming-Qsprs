package com.linear.search;

public class FindMinimumNumber {
	static int minimum(int[] arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		
		int arr[]= {23,4,67,8,90,8} ;
		System.out.println(minimum(arr));
	}

}
