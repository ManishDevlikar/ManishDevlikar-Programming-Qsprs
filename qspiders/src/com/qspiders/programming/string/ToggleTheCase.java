package com.qspiders.programming.string;

public class ToggleTheCase {
	public static String toUpperCase(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String str = "UPPER_lower";
		System.out.println(toUpperCase(str));
	}
}
