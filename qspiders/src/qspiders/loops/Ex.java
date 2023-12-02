package qspiders.loops;

import java.util.Iterator;

public class Ex {
	int i=100;
	static int j=10;
	public void sheela() {
		int i=10;
		Ex x=new Ex();
		System.out.println(i);
System.out.println(x);
System.out.println("sheela this address"+this);
		System.out.println("inside: "+x.i);
		System.out.println("inside sheela "+this.i);
System.out.println("static method inside non static");
		System.out.println("static method call directly:"+staticMe());
		System.out.println("static method call using Class name : "+Ex.staticMe());
		System.out.println("static method call using this keyword: "+this.staticMe());
System.out.println("static variables inside non static");
		System.out.println("static variable access directly: "+j);
		System.out.println("static variable access using class name: "+Ex.j);
		System.out.println("static variable access using this keyword: "+this.j);
System.out.println("non static method access inside non static methods");
		System.out.println("non static variable access directly: "+me());
		System.out.println("non static method call using this keyword: "+this.me());
System.out.println("non static variable access inside non static methods");
		System.out.println("non static variable access using this keyword: "+this.i);
		System.out.println("non static variable access directly: "+i);	
	}
	public String me() {
		return "Inside Non static method";
		
	}
	public static void add() {
		Ex x=new Ex();
		System.out.println("add method x address: "+x);
System.out.println("static variable inside static method");
		System.out.println("static variable access directly: "+j);
		System.out.println("static variable access using class name: "+Ex.j);
		System.out.println("static variable access using reference variable: "+x.j);
System.out.println("static method inside static method");
		System.out.println("static method call directly: "+staticMe());
		System.out.println("static method call using class name: "+Ex.staticMe());
		System.out.println("static method call using referece variable: "+x.staticMe());
System.out.println("non static variable inside static method");
		System.out.println("non static variable access using reference variable: "+x.i);
System.out.println("non static method inside static method");		
		System.out.println("non static method call using reference variable: "+x.me());
		
	}
	public static String staticMe() {
		return "Inside Static";
	}
	public static void main(String[] args) {
		Ex x=new Ex();
		System.out.println("Main method X address: "+x);
		x.sheela();
		x.add();
	}

}
