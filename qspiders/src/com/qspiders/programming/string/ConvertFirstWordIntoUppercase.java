package com.qspiders.programming.string;

public class ConvertFirstWordIntoUppercase {
	public static void convertFirstIntoUpper(String str) {
		String[] arr = str.split(" ");
		for (String s : arr) {
			char[] ch = s.toCharArray();
			if (ch[0] >= 'a' && ch[0] <= 'z') {
				ch[0] = (char) (ch[0] - 32);
			}
			s = new String(ch);
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		convertFirstIntoUpper("welcome to thane");
	}
}
