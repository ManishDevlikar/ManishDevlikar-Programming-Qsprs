package com.stackandqueue.queue;

public class MainQueue {
	public static void main(String[] args) throws Exception {
		CircularQueue queue = new CircularQueue(5);
		queue.insert(3);
		queue.insert(6);
		queue.insert(6); 
		queue.insert(19);
		queue.insert(1);
		System.out.println("Removed Item: "+queue.remove());
		System.out.println("Front Item: "+queue.front());
		queue.display();
		queue.insert(10);
		queue.display();
	}
}
