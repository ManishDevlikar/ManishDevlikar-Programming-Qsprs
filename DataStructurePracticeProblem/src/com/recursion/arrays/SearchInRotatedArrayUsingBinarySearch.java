package com.recursion.arrays;

public class SearchInRotatedArrayUsingBinarySearch {
 static int rotatedBinarySearch(int arr[], int target,int start,int end ) {
	 if(start>end) {
		 return -1;
	 }
	 int mid=start+(end-start)/2;
	 if(arr[mid]==target) {
		 return mid;
	 }
	 if(arr[start]<=arr[mid]) {
		 if(target>=arr[start]&&target<=arr[mid]) {
			return rotatedBinarySearch(arr,target,start,mid-1); 
		 }else {
			 return rotatedBinarySearch(arr,target,mid+1,end);
		 }
	 }
	 if(target>=arr[mid]&&target<=arr[end]) {
		return rotatedBinarySearch(arr,target,mid,end);
	 }
	 return rotatedBinarySearch(arr,target,start,mid-1);
 }
 public static void main(String[] args) {
	int[] arr= {5,6,7,8,9,1,2,3};
	System.out.println(rotatedBinarySearch(arr,2,0,arr.length-1));
}
}
