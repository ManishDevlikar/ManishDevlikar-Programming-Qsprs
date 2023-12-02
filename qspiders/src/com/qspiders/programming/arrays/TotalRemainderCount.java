package com.qspiders.programming.arrays;

public class TotalRemainderCount {
	public static int div(int arr[],int num) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			int mod=arr[i]%num; 
				count+=mod;
			
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {2,5,6,7,8,10,56,2,4,8,9,47};
		System.out.println("Total remainder "+div(arr,6));
	}
}
