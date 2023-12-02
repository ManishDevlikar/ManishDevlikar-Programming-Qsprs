package qspiders.assignments;

public class Ex1 {
	int a=10;
	static int b=20;
	static {
		System.out.println("static 1");
		stattic();
		Ex1 e=	new Ex1();
		e.nonstatic();
		System.out.println(b);
	}
	{
		System.out.println("non static 1");
		stattic();
		nonstatic();
		System.out.println(a);
		System.out.println(b);
	}
	public void nonstatic() {
		System.out.println("non static block");
		System.out.println(a);
	}
	public static void stattic() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
	Ex1 e=	new Ex1();
		System.out.println(e.a);
		
	}
	
	{
		System.out.println("non static 2");
	}
	static {
		System.out.println("static 2");
	}
	{
		System.out.println("non static 3");
	}

}
