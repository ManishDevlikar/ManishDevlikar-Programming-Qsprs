package com.arrays;

public class FindMaxInArray {
	static int max(int[] arr){
		int maxVal=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxVal) {
				maxVal=arr[i];
			}
		}
		return maxVal;
	}
	
	static int maxRange(int[] arr ,int start, int end){
		int maxVal=arr[start];
		for(int i=start;i<=end;i++) {
			if(arr[i]>maxVal) {
				maxVal=arr[i];
			}
		}
		return maxVal;
	}
	

	public static void main(String[] args) {
		int[] arr={3,56,67,3,21,9};
		System.out.println(maxRange(arr,4,5));
//		System.out.println(max(arr));
	}
	

}
