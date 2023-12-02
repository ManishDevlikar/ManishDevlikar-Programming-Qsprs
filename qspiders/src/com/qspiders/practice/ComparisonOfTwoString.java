package com.qspiders.practice;

public class ComparisonOfTwoString {
	public static void main(String[] args) {
		String s1="manish";
		String s2=new String("manish");
		String s3="manish";
		s3="sunny";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
	}
}
