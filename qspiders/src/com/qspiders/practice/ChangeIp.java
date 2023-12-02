package com.qspiders.practice;

public class ChangeIp {
	public static void main(String[] args) {
		String address = "1.1.1.1";
		int index = 0, n = address.length();
		String ans = "";
		while (index < n) {
			if (address.charAt(index) == '.') {
				ans += "[.]";
			} else {
				ans += address.charAt(index);
			}
			index++;
		}
		System.out.println(ans);
	}
}

//	public static void changeIp(String address) {
//	
//	}
