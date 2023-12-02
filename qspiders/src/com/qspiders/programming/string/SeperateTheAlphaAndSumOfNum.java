package com.qspiders.programming.string;

public class SeperateTheAlphaAndSumOfNum {
	public static String getConString(String str) {
		String res ="";
		int sum=0;
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char c= str.charAt(i);
			if(c>='A'&&c<='Z' || c>='a'&&c<='z') {
				count++;
				res=res+c;
			}else if(c>='0'&&c<='9') {
				sum=sum+(c-'0');
			}
		}
		return count+res+sum;
	}
	public static void main(String[] args) {
		String str="Man3t4fbhv";
		System.out.println(getConString(str));
		
	}
}
