package com.linear.search;

import java.util.Arrays;

public class SearchMaximumIn2DArray {
	static int[] search(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[]{row,col};
				}
			}
			
		}return null;
	}
	
		static int max(int[][] arr) {
			int max=Integer.MIN_VALUE;
			for(int row=0;row<arr.length;row++) {
				for (int col=0;col<arr[row].length;col++) {
					if(arr[row][col]>max) {
						max=arr[row][col];
					}
				}
			}return max;
		}
		
		
	public static void main(String[] args) {
		int[][] arr= {
				{23,45,67,89},
				{45,67,87},
				{20,30,40}
		};
int target=45;
int[] ans=search(arr,target);
System.out.println(Arrays.toString(ans));
System.out.print("Maximun Number in Array is: ");
System.out.print(max(arr));
//System.out.println(Integer.MIN_VALUE);
	}

}
