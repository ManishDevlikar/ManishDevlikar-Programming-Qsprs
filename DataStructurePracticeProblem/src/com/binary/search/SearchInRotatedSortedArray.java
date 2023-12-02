package com.binary.search;

public class SearchInRotatedSortedArray {
	// not work in duplicate value
	static int search(int[] nums,int target) {
		int pivot=findPivot(nums);
		// if you did not find the pivit means the array is not rotated
		if(pivot==-1) {
			//do normal binary search
			return binarySearch(nums,target,0,nums.length-1);
		}
//if pivot is found you have found 2 Asc sortrted arrays
		if(nums[pivot]==target) {
			return pivot;
		}
		if(target>=nums[0]) {
			return binarySearch(nums,target,0,pivot-1);
		}
		return binarySearch(nums ,target,pivot+1,nums.length-1);
		
	}
	
	static int binarySearch(int[] arr,int target,int start,int end) {
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
		return-1;
	}
	
	static int findPivot(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid>start&& arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid]<=arr[start]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {3,2,3,2,3};
		System.out.println(findPivot(arr));
	}
}
