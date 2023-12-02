package com.stackandqueue.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(20);
		deque.addFirst(10);
		deque.addLast(30);
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
	}
}
