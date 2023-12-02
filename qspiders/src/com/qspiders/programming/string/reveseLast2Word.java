package com.qspiders.programming.string;
// revese Last  two Word with space bet them
public class reveseLast2Word {
	public static void main(String[] args) {
		System.out.println(getReversLastTwo("bat"));
	}
	public static String getReversLastTwo(String str) {	
		String res=str.charAt(str.length()-1)+" "+str.charAt(str.length()-2);
		return res;
	}
}
