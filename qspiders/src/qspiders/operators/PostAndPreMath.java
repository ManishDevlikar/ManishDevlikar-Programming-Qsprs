package qspiders.operators;

public class PostAndPreMath {

	public static void main(String[] args) {
		int x=3;
		int y=++x - --x;
		int z=y++ + --x;
		
		System.out.println(z++ * --x +y-- * ++z);
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);

	}

}
