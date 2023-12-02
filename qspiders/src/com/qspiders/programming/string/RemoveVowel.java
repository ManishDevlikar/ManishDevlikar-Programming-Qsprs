package com.qspiders.programming.string;

public class RemoveVowel {
	public static boolean isVowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			return true;
		}
		return false;
	}
	public static String removeVowel(String str) {
		String res="";
		for (int i = 0; i < str.length(); i++) {
			if(isVowel(str.charAt(i))) {
				continue;
			}else {
				res=res+str.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(removeVowel("education"));
		System.out.println(removeVowel("manish"));
		
	}
}
