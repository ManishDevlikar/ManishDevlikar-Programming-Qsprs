package com.qspiders.programming.arrays;

public class LinearSearchElement {
	public static int search(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,4,6,7,8};
		System.out.println(search(arr,7));
		searchIn(arr,7);
	}
	public static void searchIn(int arr[],int target) {
		boolean boo=false;
//		int index=-1;
		int i=0;
		for (; i < arr.length; i++) {
			if(arr[i]==target) {
				boo=true;
				break;
			}
		}
		if(boo==true) {
			System.out.println("Element Present At: " +i);
		}else {
			System.out.println("Element not found");
		}
	}
}
