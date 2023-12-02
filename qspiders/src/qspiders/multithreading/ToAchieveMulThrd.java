package qspiders.multithreading;
// using Thread Class
public class ToAchieveMulThrd extends Thread {
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		ToAchieveMulThrd t1=new ToAchieveMulThrd();
		ToAchieveMulThrd t2=new ToAchieveMulThrd();
		t1.start();
		t2.start();
		
	}
}
