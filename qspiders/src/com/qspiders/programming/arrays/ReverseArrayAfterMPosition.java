package com.qspiders.programming.arrays;
import java.util.*;
import java.util.Arrays;

public class ReverseArrayAfterMPosition {
	public static void reverse(int arr[],int m) {
		int start=m+1;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55,66,77,88,99};
		reverse(arr,5);
		ArrayList <Integer> arr1=new ArrayList<>();
		arr1.add(11);
		arr1.add(22);
		arr1.add(33);
		arr1.add(44);
		arr1.add(55);
		arr1.add(66);
		arr1.add(77);
		arr1.add(88);
		arr1.add(99);
		rev(arr1,5);
	}
	public static void rev(ArrayList<Integer> arr,int m) {
		int start=m+1;
		int end=arr.size()-1;
		while(start<end) {
			int temp=arr.get(start);
			arr.set(start, arr.get(end));
			arr.set(end, temp);
			start++;
			end--;
		}
		System.out.println(arr);
	}
}
