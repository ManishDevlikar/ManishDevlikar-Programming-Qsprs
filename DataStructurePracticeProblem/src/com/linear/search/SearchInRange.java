package com.linear.search;

public class SearchInRange {
	static int linearSearch(int[] arr,int target,int start,int end) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=start;i<=end;i++) {
			int element=arr[i];
			if (element==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,45,6,77,8,9,0};
		int target=99;
		int ans=linearSearch(arr,target,0,4);
		System.out.println(ans);
	}

}
