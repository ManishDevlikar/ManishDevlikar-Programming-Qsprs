package qspiders.methods;

public class Recursion {
	final public static void main(String... x) {
		rec(25);
	}

	public static void rec(int i) {
		if (i > 2500) {
			return;
		}
		System.out.println(i);
		rec(i + 1);
	}
}
