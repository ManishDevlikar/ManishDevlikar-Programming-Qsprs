package com.binary.search;

import java.util.Arrays;

public class FindTheFirstAndLastElementInSortedArray {
static int[] searchRange(int[] nums,int target) {
		int[] ans= {-1,-1};
		//check for first occurrence if target first 
//		ans[0]=search(nums,target,true);
//		ans[1]=search(nums,target,false);

		ans[0]=search(nums,target,true);
		if(ans[0]!=-1) {
			ans[1]=search(nums,target,false);	
		}
		return ans;
	}
	//this function returns the index of target
static int search(int[] nums,int target,boolean findStartIndex) {
		int ans=-1;
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<nums[mid]) {
				end=mid-1;
			}
			else if(target>nums[mid]) {
				start=mid+1;
			}
			else 
			{
				//potential ans is found
				ans=mid;
				if(findStartIndex) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums= {2,3,3,3,4,5,6};
		int target=3;
		System.out.println(Arrays.toString(searchRange(nums,target)));
	}

}
