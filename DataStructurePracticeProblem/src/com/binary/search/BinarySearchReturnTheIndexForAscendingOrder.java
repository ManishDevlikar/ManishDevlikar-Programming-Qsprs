package com.binary.search;
// for ascending order
public class BinarySearchReturnTheIndexForAscendingOrder {
	static int binarySearch(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
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
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		int target=8;
		System.out.println(binarySearch(arr,target));
	}

}

//int s=5;
//int e=8;
//int ans= s+(e-s)/2;
//int ans2=(s+e)/2;
//
//System.out.println(ans);
//System.out.println(ans2);
//System.out.println(3/2);