package com.binary.search;

public class OrderAgnosticBinarySearch {
	static int orderAgnosticBS(int[] arr,int target) {
	int	start=0;
	int end=arr.length-1;
	//is array is sorted in ascending or descending 
	boolean isAsc=arr[start]<arr[end];
	
	while(start<=end) {
		int mid=start+(end-start)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		if(isAsc) {
			if(target<arr[mid]) {
				end=mid-1;
			}else{
				start=mid+1;
			}
		}
		else {
			if(target>arr[mid]) {
				end=mid-1;
			}else{
				start=mid+1;
			}
		}
		
		
	}
	return -1;
	}
	public static void main(String[] args) {
		int[] arr= {11,13,14,16,17,19};
		int target=15;
		System.out.println(orderAgnosticBS(arr,target));

	}

}
//is array is sorted in ascending or descending 
//boolean isAsc;
//if(arr[start]<arr[end]) {
//	isAsc=true;
//}else {
//	isAsc=false;
//}

//else {
//return mid;
//}
