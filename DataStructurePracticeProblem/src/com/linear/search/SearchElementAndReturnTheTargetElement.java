package com.linear.search;

public class SearchElementAndReturnTheTargetElement {
	static boolean linearSearch(int[] arr,int target) {
		if(arr.length==0) {
			return false;
		}
		for(int i=0;i<arr.length;i++) {
		int element=arr[i];
		if(element==target) {
			return true;
		}
		}
		return false;
	}
	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,67,8,9};
	int target=3;
	
	System.out.println(linearSearch(arr,target));

	}

}
