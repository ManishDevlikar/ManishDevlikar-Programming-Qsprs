package com.qspiders.programming.string;

public class PalindromeOfString {
	public static boolean isPalindrome(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println(res);
		if (res.equalsIgnoreCase(str)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "qqwwwwqq";
		System.out.println(isPalindrome(str));
		System.out.println(isPalindrome2(str));
	}

	public static boolean isPalindrome2(String str) {
		str = str.toLowerCase();
		if (str == null || str.length() == 0) {
			return true;
		}
		for (int i = 0; i < str.length() / 2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length() - 1 - i);
			if (start != end) {
				return false;
			}

		}
		return true;
	}
}
