package com.stackandqueue.stack;

public class StackMain {
	public static void main(String[] args) throws StackException {
		CustomStack stack=new CustomStack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
	}
}
