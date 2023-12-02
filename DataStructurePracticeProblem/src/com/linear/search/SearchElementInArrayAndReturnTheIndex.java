package com.linear.search;

public class SearchElementInArrayAndReturnTheIndex {
	static int linearSearch(int[] arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		for (int i=0;i<arr.length;i++) {
			int element=arr[i];
			if(element==target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {1,4,56,6,78,8};
		int target=6;
		int ans=linearSearch(arr,target);
		System.out.println(ans);
	}

}
