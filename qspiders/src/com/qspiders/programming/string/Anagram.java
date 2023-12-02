package com.qspiders.programming.string;

public class Anagram {
	public static void main(String[] args) {
		isAnagram("manish", "shanim");
	}

	public static void isAnagram(String str1, String str2) {

		if (str1.length() == str2.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			sort(ch1);
			sort(ch2);
			boolean flag = true;
			for (int i = 0; i < ch2.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("anagram");
			} else {
				System.out.println("not an anagram");
			}

		} else {
			System.out.println("Not an anagram");
		}
	}

	public static void sort(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1 - i; j++) {
				if (ch[j] > ch[j + 1]) {
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
	}
}
