package qspiders.methods;

public class noArgumentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(res());
		res();
	}
//	public static void add() {
//		int a=10;
//		int b=90;
//		int res=a+b;
//		System.out.println(res);
//	}
	public static int a(int a) {
		return a;
//		System.out.println(a);
	}
	public static int b(int b) {
		return b;
//		System.out.println(b);
	}
	
	public static int res() {
		return a(5)+b(5);
	}

}
