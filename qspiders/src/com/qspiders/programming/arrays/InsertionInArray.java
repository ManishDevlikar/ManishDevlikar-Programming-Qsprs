package com.qspiders.programming.arrays;

public class InsertionInArray {
	public static int[] insert(int arr[],int element,int index) {
		if(index<0 || index>arr.length) {
			System.out.println("check the index");
			return arr;
		}
		int[] arr2=new int[arr.length+1];
		arr2[index]=element;
		
		for(int i=0;i<arr.length;i++) {
			if(i<index) {
				arr2[i]=arr[i];
			}else {
				arr2[i+1]=arr[i];
			}
		}
		return arr2;
	}
	public static void main(String[] args) {
		int arr[]= {2,9,3,4};
	arr=insert(arr,20,2);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		update(arr,0,250);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void update(int arr[],int index,int value) {
		if(index<0 || index>arr.length) {
			System.out.println("check the index");
			return;
		}
		arr[index]=value;
	}
	public static void read(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
