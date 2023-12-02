package com.qspiders.programming;

public class ProdOfStringFromMiddle {

	public static int isSmile(String str) {
		if (str.length() < 2) {
			return 1;
		}
		if (str.length() % 2 != 0) {
			return 0;
		}
		String s1 = str.substring(0, str.length() / 2);
		String s2 = str.substring(str.length() / 2);

		int leftAns = getProd(s1);
		int rightAns = getProd(s2);

		if (leftAns == rightAns) {
			System.out.println("left: " + leftAns + " Right: " + rightAns);
			return 1;
		} else {
			System.out.println("left: " + leftAns + "Right: " + rightAns);
			return 0;
		}
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(isSmile(str));
//		isSmile(str);
	}

	public static int getProd(String str) {
		int num = Integer.parseInt(str);
		int res = 1;
		while (num > 0) {
			int mod = num % 10;
			res *= mod;
			num /= 10;
		}
		return res;
	}

}
