package com.qspiders.programming.string;

import java.util.Iterator;

public class ConvertLowerToUpper {
	public static void convertToUppercase(String str) {
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				System.out.print(ch[i]=(char) (ch[i]-32));
			}				
		}
		System.out.println(new String(ch));
	}
	public static void main(String[] args) {
		String str="MANIsH";
		convertToUppercase(str);
	}
}
