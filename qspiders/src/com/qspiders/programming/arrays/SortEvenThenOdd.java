package com.qspiders.programming.arrays;

import java.util.Arrays;
//import java.util.ArrayList;
import java.util.LinkedList;

public class SortEvenThenOdd {
	public static void sortEvenOdd(int arr[]) {
		LinkedList<Integer> res=new LinkedList<Integer>();
		LinkedList<Integer> even=new LinkedList<Integer>();
		LinkedList<Integer>odd =new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				even.add(arr[i]);
			}
			else {
				odd.add(arr[i]);
			}
		}
		res.addAll(even);
		res.addAll(odd);
		System.out.println(res);
	}
	public static void main(String[] args) {
		int[] arr= {3,4,2,6,3,7,9,2,12,14,57,79};
		sortEvenOdd(arr);
		sortEvenOdd2(arr);
	}
	public static void sortEvenOdd2(int arr[]) {
		int [] res= new int[arr.length];
		int k=0;
		for (int i = 0; i < res.length; i++) {
			if(arr[i]%2==0) {
				res[k]=arr[i];
				k++;
			}
		}
		for (int i = 0; i < res.length; i++) {
			if(arr[i]%2!=0) {
				res[k]=arr[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
