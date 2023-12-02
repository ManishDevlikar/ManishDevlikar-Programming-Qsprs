package com.qspiders.programming.string;

public class OccurrenceOfEachCharInString {
	public static void main(String[] args) {
		String str="maharastra";
		char[] c=str.toCharArray();
		
		boolean[] b=new boolean[c.length];
		
		for (int i = 0; i < c.length; i++) {
			if(b[i]==false) {
				int count=1;
				for (int j = i+1; j < c.length; j++) {
					if(c[i]==c[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(c[i]+" "+count);
			}
		}
	}
}
