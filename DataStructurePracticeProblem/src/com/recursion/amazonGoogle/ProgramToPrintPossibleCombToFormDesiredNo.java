package com.recursion.amazonGoogle;

public class ProgramToPrintPossibleCombToFormDesiredNo {
	static void possibleCom(String p,int target) {
		if(target==0) {
			System.out.println(p);
			return;
		}
		for(int i=1;i<=6 && i<=target;i++) {
			possibleCom(p+i,target-i);
		}
		
	}
	public static void main(String[] args) {
		possibleCom("",4);
	}
}
