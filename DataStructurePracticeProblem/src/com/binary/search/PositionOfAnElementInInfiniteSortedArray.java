package com.binary.search;

public class PositionOfAnElementInInfiniteSortedArray {
	static int elementPosition(int[] arr,int target) {
		int start=0;
		int end=1; //end=1 bcoz we start from index0and1 chunks and as we go further size gets increses 
		while(target>arr[end]) {
			int temp=end+1;
			end=end+(end-start)*2;
			start=temp;
		}
		return searchElement(arr,target,start,end);
		
	}
static int searchElement(int[] arr,int target,	int start,	int end) {
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(target<arr[mid]) {
			end=mid-1;
		}
		else if(target>arr[mid]) {
			start=mid+1;
		}
		else {
			return mid;
		}
	}
	return -1;
}
	public static void main(String[] args) {
	int arr[]= {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	int target=3;
	System.out.println(elementPosition(arr,target));

	}

}
