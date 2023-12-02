package com.qspiders.programming.string;

public class VowelCount {
	public static boolean isVowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			return true;
		}
		return false;
	}
	public static int getCount(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(isVowel(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(getCount("mdecokmdike"));
		
	}
}
