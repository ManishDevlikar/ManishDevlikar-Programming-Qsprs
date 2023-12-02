package qspiders.oop.polymorphism;



class Test {
	 public static void main(String[] args) {
		P1 r1=new P1();
		System.out.println(r1.i);
		P2 r2 = new P2();
		System.out.println(r2.i);
		P1 r3 = new P2();
		System.out.println(r3.i);
	}
}

