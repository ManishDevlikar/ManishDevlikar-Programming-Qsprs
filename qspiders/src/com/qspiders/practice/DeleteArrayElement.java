package com.qspiders.practice;

import java.util.Arrays;

public class DeleteArrayElement {
	public static int[] insert(int arr[],int index,int element) {
		int arr2[]=new int[arr.length+1];
		arr2[index]=element;
		for (int i = 0; i < arr.length; i++) {
			if(i<index) {
				arr2[i]=arr[i];
			}else {
				arr2[i+1]=arr[i];
			}
		}
		return arr2;
	}
	public static int[] delete(int[] arr, int index) {
		int arr2[]=new int[arr.length-1];
		for (int i = 0,k=0; i < arr.length; i++) {
			if(i==index) {
				continue;
			}
			arr2[k++]=arr[i];
		}
		return arr2;
	}
	public static void main(String[] args) {
		int arr[]=new int[0];
		arr=insert(arr,0,12);
		arr=insert(arr,1,13);
		arr=insert(arr,1,15);
		arr=delete(arr,0);
		System.out.println(Arrays.toString(arr));
		
	}
	
}
