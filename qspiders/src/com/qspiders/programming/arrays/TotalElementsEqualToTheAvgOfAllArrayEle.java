package com.qspiders.programming.arrays;

public class TotalElementsEqualToTheAvgOfAllArrayEle {
	static int getTotalElement(int arr[]) {
		int sum=0;
		int avg=0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==avg) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr={1,3,2,5};
		System.out.println(getTotalElement(arr));
	}
}
