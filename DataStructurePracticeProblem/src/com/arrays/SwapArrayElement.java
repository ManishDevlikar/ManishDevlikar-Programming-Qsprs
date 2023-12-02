package com.arrays;

import java.util.Arrays;

public class SwapArrayElement {
	static void swap(int[] arr,int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6};
swap(arr,3,1);
System.out.println(Arrays.toString(arr));
	}

}
