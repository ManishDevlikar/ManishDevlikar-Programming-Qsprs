package com.oop.objectCloning;

public class mainForHuman {

	public static void main(String[] args) throws CloneNotSupportedException {
		Human manish = new Human("Manish",999);
//		Human manish2 = new Human(manish);
//		System.out.println(manish2.age);
		Human max=(Human)manish.clone();
		System.out.println(max.name);
	}

}
