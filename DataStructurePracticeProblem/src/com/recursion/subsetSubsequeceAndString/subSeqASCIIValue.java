package com.recursion.subsetSubsequeceAndString;

import java.util.ArrayList;

public class subSeqASCIIValue {
	static void subSeqASCII(String p,String unp) {
		if(unp.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch= unp.charAt(0);
		subSeqASCII(ch+p,unp.substring(1));
		subSeqASCII(p,unp.substring(1));
		subSeqASCII(p+(ch+0),unp.substring(1));
	}
	

	
	public static void main(String[] args) {
		subSeqASCII("","abc");
	
	}
}
