package qspiders.methods;

public class PossibleMainMethod {
	int x=10;
	static int  y=20;
	char c;
//	final strictfp synchronized public static void main(String... manish) {
//		System.out.println("Manish");
//	}
	public static void main(String[] args) {
		String[] argh= {"a","b","c"};
		args=argh;
//		System.out.println(args[1]);
		for(String s:args) {
			System.out.println(s);
		}
		PossibleMainMethod p=new PossibleMainMethod();
		p.m();
		System.out.println(y);
		System.out.println(p.c);
	}
	
	public void m() {
		int x=100;
		PossibleMainMethod p=new PossibleMainMethod();
		System.out.println(p.x);
		System.out.println(x);
	}

}
