package com.qspiders.programming.arrays;

import java.util.Arrays;

public class MissingNumberInAnArray {
	public static void getMissingElement(int arr[]) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==i+1) {
				continue;
			}
			System.out.println(i+1);
		}
		
	}
	public static void getMissingElement2(int arr[]) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
	}
	public static void getMissingElement3(int arr[]) {
		int n=arr.length+1;
		int sum1=(n*(n+1))/2;
		int sum2=0;
		for (int i = 0; i < arr.length; i++) {
			sum2+=arr[i];
		}
		System.out.println(sum1-sum2);
	}
	public static void main(String[] args) {
		int[] arr={3,2,1,4,6,5,8};
		getMissingElement(arr);
		getMissingElement2(arr);
		getMissingElement3(arr);
		System.out.println(getmiss(arr));
	}
	public static int getmiss(int arr[]) {
		int miss=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				miss=i+1;
			}
		}
		return miss;
	}
}
