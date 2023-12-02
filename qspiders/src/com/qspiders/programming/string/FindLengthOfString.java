package com.qspiders.programming.string;

public class FindLengthOfString {
	public static int getLength(String str) {
		char[] ch=str.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(getLength("manish"));
		System.out.println(getLength2("manish"));
	}
	
	public static int getLength2(String str) {
		char[] ch=str.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;
		}
		return count;
	}
}
