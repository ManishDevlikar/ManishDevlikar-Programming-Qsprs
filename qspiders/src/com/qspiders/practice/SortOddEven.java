package com.qspiders.practice;

import java.util.Arrays;
// sort odd even odd in decreasing order even in increasing order
public class SortOddEven {
	public static void sortOddEven(int[] nums) {
		// Write your code here.
		int arr[]=new int[nums.length];
		int k=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]%2!=0){
				arr[k++]=nums[i];
			}
		}
		
		for(int dec=1;dec<arr.length;dec++) {
			int temp=arr[dec];
			int j=dec;
			
			while(j>0 && arr[j-1]<temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		
		
		for(int j=0;j<nums.length;j++){
			if(nums[j]%2==0){
				arr[k++]=nums[j];
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {2,5,3,6};
		sortOddEven(arr);
	}
}
