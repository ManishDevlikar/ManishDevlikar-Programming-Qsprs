package com.binary.search;

public class FindCeilingOfNumber {

	static int ceiling(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
//		boolean isAsc=arr[start]<arr[end];
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return arr[start];
		
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//	
//		if(arr[mid]==target) {
//			return mid;
//		}
//		if(isAsc) {
//			if(target<arr[mid]) {
//				return end=mid-1;
//			}else {
//				return start=mid+1;
//			}
//		}
//		else {
//			if(target>arr[mid]) {
//				end=mid-1;
//			}else{
//				start=mid+1;
//			}
//		}
//		}
//		return start;
//		
	}
	public static void main(String[] args) {
		int[] arr= {11,13,15,17,19};
		int target=16;
		System.out.println(ceiling(arr,target));

	}

}
