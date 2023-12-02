package com.qspiders.programming.arrays.searching;

public class BinarySearch {
	public static int search(int[] arr,int target) {
		int start=0;
		int end= arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>target) {
				end=mid-1;
			}else if(arr[mid]<target) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		System.out.println(search(arr,5));
		System.out.println(Binarysearch(arr,5));
	}
	public static int Binarysearch(int[] arr,int target) {
		int start=0;
		int end= arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
}
