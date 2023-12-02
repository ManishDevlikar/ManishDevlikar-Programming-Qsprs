package com.qspiders.programming.string.regex;

import java.util.regex.Pattern;

public class SplitString {
	public static void main(String[] args) {
//		Pattern p=Pattern.compile("\\.");
		Pattern p=Pattern.compile("[.]");
		String[] str=p.split("www.manishdevlikar.com");
		
		for (String string : str) {
			System.out.println(string);
		}
	}
}
