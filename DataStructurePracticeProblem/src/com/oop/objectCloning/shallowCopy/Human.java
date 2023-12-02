package com.oop.objectCloning.shallowCopy;

public class Human implements Cloneable{
	String name;
	int age;
	int[] element;
	public Human(String name,int age) {
		this.name=name;
		this.age=age;
		this.element=new int[]{1,2,3,4,5};
		
	}
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	public Object clone() throws CloneNotSupportedException {
		Human twin =(Human)super.clone();// this is deep copy
		// to make deep copy
		twin.element=new int[twin.element.length];
		for(int i=0;i<twin.element.length;i++) {
			twin.element[i]=this.element[i];
		}
		return twin;
	}
}
