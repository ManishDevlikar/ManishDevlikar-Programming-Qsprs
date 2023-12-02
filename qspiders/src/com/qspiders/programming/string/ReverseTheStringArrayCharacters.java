package com.qspiders.programming.string;

public class ReverseTheStringArrayCharacters {
	public static String getReverse(String str) {
		String temp[] = str.split(" ");
		String res = "";
		for (int i = 0; i < temp.length; i++) {
			for (int j = temp[i].length() - 1; j >= 0; j--) {
				res = res + temp[i].charAt(j);
			}
			res = res + " ";
		}
		return res.trim();
	}

	public static void main(String[] args) {
		String str = "welcome to thane";

		System.out.println(getReverse(str));
	}
}
