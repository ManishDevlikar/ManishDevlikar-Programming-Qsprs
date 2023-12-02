package qspiders.assignments;

public class p4 {
	static boolean a;
	static char b;
	
	public static void qsp() {
		System.out.println("QSP B");
		System.out.println(a);
		System.out.println(b);
		a=true;
		b='a';
		System.out.println("QSP E");
	}
	
	public static void jsp() {
		System.out.println("JSP B");
		qsp();
		System.out.println(a);
		System.out.println(b);
		a=false;
		b='b';
		System.out.println("JSP E");
	}
	static {
		System.out.println("SIB 1");
	}
	public static void main(String[] args) {
		System.out.println("MB");
		int a=10;
		double b=10;
		jsp();
		System.out.println(a);
		System.out.println(p4.a);
		System.out.println(p4.b);
		System.out.println(b);
		System.out.println("ME");
	}
	static {
		qsp();
	}
}
