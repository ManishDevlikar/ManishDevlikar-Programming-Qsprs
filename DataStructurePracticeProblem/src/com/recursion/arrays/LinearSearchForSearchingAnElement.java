package com.recursion.arrays;

public class LinearSearchForSearchingAnElement {
	static boolean find(int arr[],int target,int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target || find(arr,target,index+1);
	}
	
		
	// to return index value
	static int index(int[] arr,int target,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		return index(arr,target,index+1);
	}
	
	
	//to find the index from last
	static int fromLast(int[] arr,int target,int index) {
		if(index==-1) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		return fromLast(arr,target,index-1);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(fromLast(arr,5,arr.length-1));
	}
}
