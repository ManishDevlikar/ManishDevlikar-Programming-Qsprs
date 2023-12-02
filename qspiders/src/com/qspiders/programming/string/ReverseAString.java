package com.qspiders.programming.string;

public class ReverseAString {
	public static String getReverse(String str) {
		String res="";
		for (int i = str.length()-1; i >=0; i--) {
			res+=str.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		String str="manish";
		System.out.println(getReverse(str));
		System.out.println(getReverse2(str));
	}
	public static String getReverse2(String str) {
			String res="";
			
			for (int i = 0; i < str.length(); i++) {
				res=str.charAt(i)+res;
			}
			return res;
		}
	}

