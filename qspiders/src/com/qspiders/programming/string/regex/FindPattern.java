package com.qspiders.programming.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPattern {
	public static void main(String[] args) {
		int count=0;
//		Pattern p = Pattern.compile("ab");
//		Pattern p = Pattern.compile("[abc]");
//		Pattern p = Pattern.compile("[^abc]");
//		Pattern p = Pattern.compile("[a-z]");
//		Pattern p = Pattern.compile("[a-zA-z]");
//		Pattern p = Pattern.compile("[0-9]");
//		Pattern p = Pattern.compile("[a-zA-Z0-9]");
//		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
//		Pattern p = Pattern.compile("\\s");//for space
//		Pattern p = Pattern.compile("\\S");//except space
//		Pattern p = Pattern.compile("\\d");//for digit
//		Pattern p = Pattern.compile("\\D");//except digit
//		Pattern p = Pattern.compile("\\w");// for alphanumeric
//		Pattern p = Pattern.compile("\\W"); // except alphanumeric
//		Pattern p = Pattern.compile(".");// any caracter
		// quantifiers
//		Pattern p = Pattern.compile("a+");//a,aa,aaa
//		Pattern p = Pattern.compile("a*");//any number of a including zero a
		Pattern p = Pattern.compile("a?");//at most 1 a
		Matcher m=p.matcher("ababbaabcd@Aaa1a1");
		
		while(m.find()) {
			count++;
			System.out.println(m.start()+"..."+m.end()+"..."+m.group()+"..."+m.group(0));
		}
		System.out.println(count);
	}
}
