package qspiders.methods;

public class Calculator {
	public static void main(String[] args) {
//		sheela();
		int a=sum(5, 5, 5);
		int b=sum(5,5);
		int c=sum(5,5,5,5);
		int d=sum(5,5,5,5,5);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(sum(5, 5, 5));
		int res=sub(30, 23, 45);
		System.out.println(res);
		System.out.println(sub(30, 23, 45));
		System.out.println(mul(5, 5, 5, 5, 5));
		try {
			System.out.println(div(40, 0));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
//	public static void sheela() {
//		System.out.println("hii");
//		sheela();
//		System.out.println("bye");
//	}
	public static int sum(int a, int b) {
		return a + b ;
		
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
		
	}
	public static int sum(int a, int b, int c,int d) {
		return a + b + c+d;
		
	}
	public static int sum(int a, int b, int c,int d,int e) {
		return a + b + c+d+e;
		
	}

	public static int sub(int a, int b, int c) {
		return a - b - c;
	}

	public static double div(int a, int b) throws Exception {
		return a / b;
	}

	public static long mul(int a, int b, int c, int d, int e) {
		return a * b * c * d * e;
	}


}
