package com.qspiders.programming.string;

public class HashTheMsg {
	public static void getHashMsg(String str) {
		String res[]= str.split(" ");

		for (int i = 0; i < res.length; i++) {
			int x=i%3;
			if(x==0) {
				System.out.print(toPercentage(res[i])+" ");
			}
			if(x==1) {
				System.out.print(toHash(res[i])+ " ");
			}
			if(x==2) {
				System.out.print(toUppercase(res[i]));
			}
	    }
	}
	public static void main(String[] args) {
		getHashMsg("WelCome To thane");
	}
	public static boolean isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			return true;
		}
		return false;
	}
	public static String toPercentage(String str) {
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(isVowel(ch[i])) {
				ch[i]='%';
			}
		}
		return new String(ch);
	}
	public static String toHash(String str) {
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(!isVowel(ch[i])) {
				ch[i]='#';
			}
		}
		return new String(ch);
	}
	public static String toUppercase(String str) {
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]= (char) (ch[i]-32);
			}
		}
		return new String(ch);
	}
}
