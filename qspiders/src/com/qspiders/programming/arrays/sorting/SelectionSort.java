package com.qspiders.programming.arrays.sorting;
import static com.qspiders.programming.arrays.sorting.BubbleSort.*; 
import java.util.Arrays;

public class SelectionSort {
	public static int[] sort(int arr[]) {
		int[] res=new int[arr.length];
		for (int i = 0; i < res.length; i++) {
			int min=i;
			for (int j = i+1; j < res.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		copy(arr, res);		
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {5,6,3,4,1,2,-1,0};
		int res[]=sort(arr);
		System.out.println(Arrays.toString(res));
	}
}
