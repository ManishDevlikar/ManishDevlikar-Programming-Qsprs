package com.binary.search;

public class findPeakElementFromMountainArray {
static int peakMountainElement(int[] arr) {
	int start=0;
	int end=arr.length-1;
	while(start<end) {
		int mid=start+(end-start)/2;
		if(arr[mid]>arr[mid+1]){
			end=mid;		
		}else {
			start=mid+1;
		}
	}
		return arr[start];
	}
public static void main(String[] args) {
	int[] arr= {23,34,12,10};
	System.out.println(peakMountainElement(arr));
}
}
