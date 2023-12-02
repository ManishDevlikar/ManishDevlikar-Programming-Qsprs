package com.oop.polymorphism;
// method overloading
public class Number {
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	int sum(int a,int b, int c) {
		return a+b+c;
	}
	float sum(float a,float b) {
		return a+b;
	}
	String sum(String a, String b) {
		return a+" "+b;
	}
	int sum(float a,int b) {
		return (int) (a+b);
	}
}
