package com.stackandqueue.queue;

public class CustomQueue {
private int [] data;
private static final int DEFAULT_SIZE=10;
int end=0;
public CustomQueue(int size) {
	this.data=new int[size];
}
public CustomQueue() {
	this(DEFAULT_SIZE);
}

public boolean isFull() {
	return end==data.length;
}
public boolean isEmpty() {
	return end==0;
}
public boolean insert(int item) {
	if(isFull()) {
		return false;
	}
	data[end++]=item;
	return true;
}
public int remove() throws Exception {
	if(isEmpty()) {
		throw new Exception("Queue is empty");
	}
	int remove=data[0];
//	shifting
	for(int i=1;i<end;i++) {
		data[i-1]=data[i];
	}
	end--;
	return remove;
}
public int front() throws Exception {
	if(isEmpty()) {
		throw new Exception("Queue is Empty");
	}
	return data[0];
}
public void display() {
	for(int i=0;i<data.length;i++) {
		System.out.print(data[i]+" ");
	}
	System.out.println("END");
}
}
