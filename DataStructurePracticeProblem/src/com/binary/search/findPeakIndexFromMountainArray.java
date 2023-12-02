package com.binary.search;

public class findPeakIndexFromMountainArray {
	static int peakIndexInMountainArry(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				//you are in decreasing part of array
				//this may be the ans,but look at left
				end=mid;
			}
			else {
				//you are in ascending part in array
				start=mid+1;
			}
		}
	// in the end start==end and pointing to the largest number of 2 checks above
	//start and end are always trying to find max element in the above 2 checks
	// hence when they are pointing to just one element that is the max element
		return start;
	}
	public static void main(String[] args) {
		int array[]= {100,200,300,12,11,0};
		System.out.println(peakIndexInMountainArry(array));

	}

}
