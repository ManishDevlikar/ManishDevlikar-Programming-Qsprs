package com.qspiders.programming.string;

public class PasswordStrength {
	public static String isStrong(String str) {
		boolean isUppercase=false,isLowercase=false,isNumber=false,isSpecial=false;
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c>='A'&&c<='Z') {
				isUppercase=true;
			}else if(c>='a'&&c<='z') {
				isLowercase=true;
			}else if(c>='0'&&c<='9') {
				isNumber=true;
			}else {
				isSpecial=true;
			}
		}
		if(str.length()>=8&&isUppercase&&isLowercase&&isNumber&&isSpecial) {
			return "Strong Password";
		}
		return "Weak Password";
	}
	public static void main(String[] args) {
		System.out.println(isStrong("maNish@0999"));
	}
}
