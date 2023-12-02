package com.stackandqueue.stack;

public class CustomStack {
	protected int[] data;
	private static final int DEFALUT_SIZE=10;
	int ptr=-1;
	public CustomStack() {
		this(DEFALUT_SIZE);
	}
	public CustomStack(int size) {
		this.data=new int[size];
	}
	public boolean push(int item) {
		if(isFull()) {
			System.out.println("Stack is full");
			return false;
		}
		ptr++;
		data[ptr]=item;
		return true;	
	}
	
	public int pop() throws StackException {
		if(isEmpty()) {
			throw new StackException("cannot pop from an empty stack");
		}
//		int remove=data[ptr];
//		ptr--;
//		return remove;
		return data[ptr--];
	}
	
	public int peek() throws StackException {
		if(isEmpty()) {
			throw new StackException ("Cannot peek from empty stack");
		}
		return data[ptr];
	}
	
	public boolean isFull() {
		return ptr==data.length-1;
	}
	public boolean isEmpty() {
		return ptr==-1;
	}
}
