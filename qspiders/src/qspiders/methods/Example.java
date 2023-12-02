package qspiders.methods;

public class Example {
	int a;
	public void addNonStatic(int a,int b) {
		System.out.println(this.a=20);
		System.out.println(this);
//		System.out.println(a);
		this.addStatic(2,5);
//		System.out.println(a+b);
	}
	public static void addStatic(int a,int b) {
		Example e1=new Example();
		System.out.println(e1.a=50);
		System.out.println(e1);
//		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Example e=new Example();
		e.addNonStatic(1, 2);
	}

}
