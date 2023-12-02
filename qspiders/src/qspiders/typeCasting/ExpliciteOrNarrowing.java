package qspiders.typeCasting;

public class ExpliciteOrNarrowing {
	public static void main(String[] args) {
		long l=2002020l;
		int i=(int)l;
		int a=97;
		char ch=(char)a;
		char c='B';
		short s=(short) c;
		short st=98;
		char charr=(char)st;
		System.out.println(charr);
		System.out.println(i);
		System.out.println(ch);
		System.out.println(s);
	}
}
