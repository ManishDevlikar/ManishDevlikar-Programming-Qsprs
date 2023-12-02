package com.recursion.subsetSubsequeceAndString;

import java.util.ArrayList;

public class ReturnASCIIValueUsingArrayList {
	static ArrayList<String> ascii(String p,String unp){
		if(unp.isEmpty()) {
			ArrayList<String> list =new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch =unp.charAt(0);
		ArrayList<String> left= ascii(ch+p,unp.substring(1));
		ArrayList<String> right= ascii(p,unp.substring(1));
		ArrayList<String> ASCII =ascii(p+(ch+0),unp.substring(1));
		left.addAll(right);
		left.addAll(ASCII);
		return left;
	}
	public static void main(String[] args) {
		System.out.println(ascii("","abc"));
	}
}
