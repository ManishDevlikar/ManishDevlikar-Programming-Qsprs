package com.oop;

public class OverrideToString {
	String name;
	public OverrideToString(String name){
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		OverrideToString ORTS = new OverrideToString("manish");
		System.out.println(ORTS);
	}
}

