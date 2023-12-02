package com.qspiders.practice;

public class Solution {
	 public static long titleToNumber(String str)
	    {
	        int result=0;
	        for (int i = 0; i < str.length(); i++) {
	            result*=26;
	            result+=str.charAt(i) - 'A' + 1;
	        }
	        return result;
	    }
	    public static void main(String[] args){
	        System.out.println(titleToNumber("AAA"));
	    }
}
