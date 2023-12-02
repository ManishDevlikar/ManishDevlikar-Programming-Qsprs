package com.qspiders.programming.arrays;

public class FindDiffBetTwoElement {
	public static int maxDiff(int arr[]) {
		int maxDiff=arr[1]-arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]-arr[i]>maxDiff) {
					maxDiff=arr[j]-arr[i];
				}
			}
		}
		return maxDiff;
	}
	public static void main(String[] args) {
		int arr[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println("Maximum difference is " + maxDiff(arr));
	}
}
