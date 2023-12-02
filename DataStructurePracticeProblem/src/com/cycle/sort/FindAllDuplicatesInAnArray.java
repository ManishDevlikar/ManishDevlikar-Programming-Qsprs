package com.cycle.sort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
	public static List<Integer>findDuplicate(int nums[]){
		int i=0;
		while(i<nums.length) {
			int correctIndex=nums[i]-1;
			if(nums[i]!=nums[correctIndex]) {
				swap(nums,i,correctIndex);
			}else {
				i++;
			}
	}
		// to find missing numbers
				List<Integer> ans=new ArrayList<>();
				for(int index=0;index<nums.length;index++) {
					if(nums[index]!=index+1) {
						ans.add(nums[index]);
					}
				}
				return ans;
	}
	static void swap(int[] arr,int i,int correctIndex) {
		int temp=arr[i];
		arr[i]=arr[correctIndex];
		arr[correctIndex]=temp;
	}
	public static void main(String[] args) {
		int arr[]= {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicate(arr));
	}
}
