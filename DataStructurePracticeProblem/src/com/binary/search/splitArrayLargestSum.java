package com.binary.search;

public class splitArrayLargestSum {
	static int splitArray(int[] nums,int m) {
		int start=0;
		int end=0;
		for(int i=0;i<nums.length;i++) {
			start=Math.max(start, nums[i]);
			end+=nums[i];
		}
		//binary search
		while(start<end) {
			//try for the middle as potential ans
			int mid=start+(end-start)/2;
			// calculate how many pieces you can divide this in this max sum
			int sum=0;
			int pieces=1;
			for(int num:nums) {
				if(sum+num>mid) {
					sum=num;
					pieces++;
				}else {
					sum+=num;
				}
			}
			if(pieces>m) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
		return end;//start and end are same 
	}
	public static void main(String[] args) {
		int arr[]= {7,2,5,10,8};
		int m=2;
		System.out.println( splitArray(arr, m));
	}
}
