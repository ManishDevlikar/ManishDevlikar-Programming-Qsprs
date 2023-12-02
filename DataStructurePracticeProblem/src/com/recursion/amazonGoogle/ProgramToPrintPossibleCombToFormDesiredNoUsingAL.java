package com.recursion.amazonGoogle;
import java.util.ArrayList;
public class ProgramToPrintPossibleCombToFormDesiredNoUsingAL {
	static ArrayList<String> possibleCom(String p,int target) {
		if(target==0) {
			ArrayList<String> list =new ArrayList<>(); 
			list.add(p);
			return list;
		}
		ArrayList<String> list =new ArrayList<>(); 
		for(int i=1;i<=6&&i<=target;i++) {
			list.addAll(possibleCom(p+i,target-i));
		}
		return list;
	}
	public static void main(String[] args) {
		System.out.println(possibleCom("",6));
	}
}
