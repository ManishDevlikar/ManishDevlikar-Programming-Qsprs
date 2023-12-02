package com.oop.inheritance;

public class BoxMain {
	public static void main(String[] args) {
//		Box box=new Box(4,3,2);
//		System.out.println(box.h+" "+box.w+" "+box.l);
		BoxChild bc=new BoxChild(3,2,1,14);
//		System.out.println(bc.weight);
		System.out.println(bc.h+" "+bc.w+" "+bc.l+" "+bc.weight);
		Box box =new BoxChild(3,4,5,6);
	}
}
