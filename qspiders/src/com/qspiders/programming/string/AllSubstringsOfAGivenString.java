package com.qspiders.programming.string;

// eg: abc -> a ab abc b bc c
public class AllSubstringsOfAGivenString {
	public static void getSubStrings(String str) {
		for (int i = 0; i < str.length(); i++) {
			String subStr = "";
			for (int j = i; j < str.length(); j++) {
				subStr += str.charAt(j);
				System.out.println(subStr);
			}
		}
	}

	public static void main(String[] args) {
		getSubStrings("abcd");
	}
}
