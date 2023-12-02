package com.qspiders.practice;

public class DecToBin {
	public static String decToBi(int num) {
		String res="";
		
		while(num!=0) {
			int mod=num%2;
			res=mod+res;
			num=num/2;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(decToBi(77));
	}
}
