package com.recursion.arrays;
import java.util.ArrayList;
public class ReturnArrayListWIthTargetIndex {
	static ArrayList<Integer> allIndex(int arr[],int target,int index, ArrayList<Integer> list){
		if(index==arr.length) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index);
		}
		return allIndex(arr,target,index+1,list);
	}
	public static void main(String args[]) {
		int arr[]= {2,4,5,4,3,4};
		ArrayList<Integer> list =new ArrayList<>();
		System.out.println(allIndex(arr,4,0,list));
	}
}
