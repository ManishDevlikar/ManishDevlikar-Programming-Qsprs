package com.recursion.amazonGoogle;
import java.util.ArrayList;
public class LetterCombinationOfPhoneNumberUsingArrayList {
	static ArrayList<String> LetterComOfPhoneNoUsingAL(String p,String up){
		if(up.isEmpty()) {
			ArrayList<String> list =new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list=new ArrayList<>();
		int digit= up.charAt(0)-'0';
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch= (char)('a'+i);
			list.addAll(LetterComOfPhoneNoUsingAL(p+ch,up.substring(1)));
		}
		return list;
	}
	public static void main(String[] args) {
		
		System.out.println(LetterComOfPhoneNoUsingAL("","12"));
	}
}
