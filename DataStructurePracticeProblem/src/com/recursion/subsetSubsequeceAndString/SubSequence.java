package com.recursion.subsetSubsequeceAndString;

public class SubSequence {
	static void subSeq(String processed,String unp) {
		if(unp.isEmpty()) {
			System.out.println(processed);
			return;
		}
		char ch=unp.charAt(0);
		subSeq(processed+ch,unp.substring(1));
		subSeq(processed,unp.substring(1));
	}
	public static void main(String[] args) {
		subSeq("","abc");
		
	}
}
