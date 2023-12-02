package com.recursion.amazonGoogle;

import java.util.ArrayList;

public class diceWithCustomFaces {
	static ArrayList<String> customFace(String p,int target,int face){
		if(target==0) {
			ArrayList<String> list =new ArrayList<>(); 
			list.add(p);
			return list;
		}
		ArrayList<String> list =new ArrayList<>(); 
		for(int i=1;i<=face&&i<=target;i++) {
			list.addAll(customFace(p+i,target-i,face));
		}
		return list;
	}
	public static void main(String[] args) {
		System.out.println(customFace("",9,3));
	}
}
