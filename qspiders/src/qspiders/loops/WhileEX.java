package qspiders.loops;

public class WhileEX {
	static String i;
	static char b;
	public static void qsp() {
		System.out.println("qsbb");
		System.out.println(b);
		System.out.println("qspe");
	}
	static {
		System.out.println("sip1");
	}

	public static void main(String[] args) {
		System.out.println("mb");
		float i=10.5f;
		qsp();
		System.out.println(i);
		System.out.println("me");

	}
	static {
		System.out.println("sip-2");
		qsp();
	}

}
