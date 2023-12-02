package com.qspiders.practice;

import java.util.Arrays;

public class Sort012 {
	public static void sort012(int[] nums)
    {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
            	 int temp=nums[mid];
                 nums[mid]=nums[low];
                 nums[low]=temp;
                mid+=1;
                low+=1;
            }else if(nums[mid]==1){
                mid+=1;
            }else if(nums[mid]==2){
            	 int temp=nums[mid];
                 nums[mid]=nums[high];
                 nums[high]=temp;
                    high-=1;   
            }
        }
    }
    public static void swap(int first,int second){
        int temp=first;
        first=second;
        second=temp;
    }
    public static void main(String[] args) {
		int nums[]= {0,1,2,0,2,1};
		int a=20;
		int b=40;
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	}
}
