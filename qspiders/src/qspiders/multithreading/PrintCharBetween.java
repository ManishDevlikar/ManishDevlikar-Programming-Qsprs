package qspiders.multithreading;

import java.util.Scanner;

public class PrintCharBetween {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Char: ");
		char a=sc.next().charAt(0);
		System.out.println("Enter End Char: ");
		char b=sc.next().charAt(0);
		
		for (char i = a; i <=b; i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
}
