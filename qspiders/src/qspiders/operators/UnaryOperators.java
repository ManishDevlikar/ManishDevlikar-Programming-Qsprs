package qspiders.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int x=1;
		int y=x++;
		System.out.println(x++ * --y + y++ - ++x);
		System.out.println(x);
		System.out.println(x--);
		System.out.println(y);
	

	}

}
