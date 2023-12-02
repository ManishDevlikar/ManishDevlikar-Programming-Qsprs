package com.qspiders.practice;

import java.util.ArrayList;

public class OddEvenUsingCollection {
	public static ArrayList<Integer> oddEvenSort(ArrayList<Integer>arr) {
		ArrayList<Integer> res = new ArrayList<>(); 
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)%2!=0) {
				odd.add(arr.get(i));
			}else {
				even.add(arr.get(i));
			}
		}
		res.addAll(odd);
		res.addAll(even);
		return res;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(7);
		arr.add(9);
		arr.add(4);
		arr.add(6);
		arr.add(8);
		
		System.out.println(oddEvenSort(arr));
	}
}
