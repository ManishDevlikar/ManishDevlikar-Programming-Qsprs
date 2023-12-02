package com.recursion;

public class BinarySearchUsingRecursion {
	static int binarySearch(int[] arr,int target ,int start,int end) {
		//base condition
		if(start>end) {
			return -1;
		}
		//body
		int mid=start+(end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]<target) {
		   return	binarySearch(arr,target,mid+1,end);
		}
		return binarySearch(arr,target,start,mid-1);
	}
	public static void main(String[] args) {
		int [] arr= {2,3,4,5,6};
		int target=4;
		int ans=binarySearch(arr,target,0,arr.length-1);
		System.out.println(ans);
	}
}
