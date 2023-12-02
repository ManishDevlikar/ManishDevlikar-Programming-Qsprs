package com.qspiders.programming.arrays.sorting;
import static com.qspiders.programming.arrays.sorting.BubbleSort.copy;

import java.util.Arrays;
public class InsertionSort {
	public static int[] sort(int arr[]) {
		int res[] = new int[arr.length];
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}

		copy(arr,res);
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5,9,7};
		int[] res=sort(arr);
		System.out.println(Arrays.toString(res));
	}
}
