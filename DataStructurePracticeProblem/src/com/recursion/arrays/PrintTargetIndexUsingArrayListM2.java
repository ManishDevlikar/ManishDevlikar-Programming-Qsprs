package com.recursion.arrays;
import java.util.ArrayList;
public class PrintTargetIndexUsingArrayListM2 {
	static ArrayList<Integer> printIndex(int[] arr,int target,int index){
		ArrayList<Integer> list = new ArrayList<>();
	if(index==arr.length) {
		return list;
	}
	if(arr[index]==target) {
		list.add(index);
	}
	ArrayList<Integer> ansFromBelowCalls=printIndex(arr,target,index+1);
	list.addAll(ansFromBelowCalls);
	return list;
	}	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4};
		System.out.println(printIndex(arr,4,0));
	}
}

// don't use this approach
