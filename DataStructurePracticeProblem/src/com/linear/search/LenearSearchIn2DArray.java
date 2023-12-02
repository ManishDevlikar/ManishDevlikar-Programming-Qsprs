package com.linear.search;

import java.util.Arrays;

public class LenearSearchIn2DArray {
	static int[] search(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col};
				}
			}
			
		}
		return null;
	}

	public static void main(String[] args) {
int [][] arr= {
		{3,4,5},
		{23,45},
		{78,90,76,43}
};
int target=90;
int[] ans=search(arr,target);
System.out.println(Arrays.toString(ans));
	}


}
