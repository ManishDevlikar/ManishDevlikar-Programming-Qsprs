package com.qspiders.programming.string;

public class CountTheSpecialChar {
	public static int getSpecialCharCount(String str) {
		char[] ch= str.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(!(ch[i]>='a'&&ch[i]<='z' || (ch[i]>='A'&& ch[i]<='Z') || ch[i]==' ' || ch[i]>='0' && ch[i]<='9')) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String str="ma#@XXV&k *AZ 9 c";
		System.out.println(getSpecialCharCount(str));
	}
}
