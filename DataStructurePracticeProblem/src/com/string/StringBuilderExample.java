package com.string;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			builder.append(ch);
		}
		System.out.println(builder);
		
	}
}
// it will not make new object as the previous exaple
//mutable