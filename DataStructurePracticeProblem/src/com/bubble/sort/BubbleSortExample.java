package com.bubble.sort;

import java.util.Arrays;

public class BubbleSortExample {

	static void bubble(int[] arr) {
		boolean swapped;
		for(int i=0;i<arr.length;i++) {
			swapped=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
			}
	}
	public static void main(String[] args) {
		int arr[]= {2,1,4,3,5};
		bubble(arr);
		System.out.print(Arrays.toString(arr));
	}
}
