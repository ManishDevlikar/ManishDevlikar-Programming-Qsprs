package com.qspiders.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SortArrayList {
	public static void sortArray(ArrayList<Integer> arr)
	{
		for(int i=1;i<arr.size();i++) {
			int temp=arr.get(i);
			int j=i;
			
			while(j>0 && arr.get(j-1)>temp) {
				arr.set(j, arr.get(j-1));
				j--;
			}
			arr.set(j, temp);
		}
		System.out.println(arr);
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(0);
		arr.add(0);
		sortArray(arr);
	}
}
