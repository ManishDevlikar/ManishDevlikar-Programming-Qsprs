package com.qspiders.programming.arrays;


//
import java.util.ArrayList;

public class ReturnTheNumberOfPairs {
	public static int returnPairs(ArrayList <Integer> al) {	
		int res=0;
		for (int i = 0; i < al.size(); i++) {
			for (int j = i+1; j < al.size(); j++) {
				if(al.get(i)==al.get(j)) {
					res++;
					al.remove(j);
					break;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr= {10,20,20,10,10,30,50,10,20};
		ArrayList <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(10);
		System.out.println(returnPairs(al));
	}
}
