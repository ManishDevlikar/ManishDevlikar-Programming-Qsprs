package com.qspiders.programming.string;

public class ShortestLengthString {
	public static void getSortestWord(String[] str) {
		int min=0;
		for (int i = 1; i < str.length; i++) {
				if(str[min].length()>str[i].length()) {
					min=i;
				}
		}
		System.out.println(str[min]);
	}
	public static void main(String[] args) {
		String str[]= {"aaaaaaaa","aa","aaa"};
		getSortestWord(str);
	}
}
