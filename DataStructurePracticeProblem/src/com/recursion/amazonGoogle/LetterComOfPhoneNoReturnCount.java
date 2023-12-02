package com.recursion.amazonGoogle;

public class LetterComOfPhoneNoReturnCount {
	static int LetterComReturnCount(String p,String up) {
		if(up.isEmpty()) {
			return 1;
		}
		int count=0;
		int digit=up.charAt(0)-'0';
		for(int i=(digit-1)*3;i<(digit*3);i++) {
			char ch=(char)('a'+i);
			count=count+LetterComReturnCount(p+ch,up.substring(1));
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(LetterComReturnCount("","12"));
	}
}
