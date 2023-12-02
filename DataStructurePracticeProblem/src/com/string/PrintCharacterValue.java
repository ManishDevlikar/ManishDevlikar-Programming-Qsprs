package com.string;

public class PrintCharacterValue {
public static void main(String args[]) {
	String s="";
	for(int i=0;i<26;i++) {
		char ch=(char)('a'+i);
	
		s=s+ch;
//		System.out.println(ch);  // to print seperate character
	}
	System.out.println(s); // to print alll character as one string
}
}
