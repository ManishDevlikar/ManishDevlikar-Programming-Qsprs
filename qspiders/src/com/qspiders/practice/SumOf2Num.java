package com.qspiders.practice;

	import java.util.* ;
	import java.io.*; 
	import java.util.ArrayList;

	public class SumOf2Num {
		public static ArrayList<Integer> sumOfTwoValues(ArrayList<Integer> nums, int k) 
	    {
			ArrayList<Integer> res = new ArrayList<Integer>();
			for (int index = 0; index < nums.size(); index++) {
				for (int i = index+1; i < nums.size(); i++) {
					if(nums.get(index)+nums.get(i)==k){
						res.add(nums.get(index));
						res.add(nums.get(i));
					}
				}
			}
			return res;
		}
		public static void main(String[] args) {
			ArrayList<Integer> res = new ArrayList<Integer>();
			res.add(4);
			res.add(4);
			res.add(5);
			res.add(6);
			res.add(7);
			System.out.println(sumOfTwoValues(res,3));
			
		}
	}

