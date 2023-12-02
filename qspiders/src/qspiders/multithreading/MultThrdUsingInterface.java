package qspiders.multithreading;

public class MultThrdUsingInterface implements Runnable{
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MultThrdUsingInterface e1= new MultThrdUsingInterface();
		Thread t1=new Thread(e1);
		Thread t2 = new Thread(e1);
		t1.start();
		t2.start();
	}
}
