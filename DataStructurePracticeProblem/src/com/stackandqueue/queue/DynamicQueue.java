package com.stackandqueue.queue;

public class DynamicQueue extends CircularQueue{
	public DynamicQueue() {
		super();
	}
	public DynamicQueue(int size) {
		super(size);
	}
	@Override
	public boolean insert(int item) {
		if(this.isFull()) {
//			double the size array
			int[] temp= new int[data.length*2];
//			copy all the previous element
			for(int i=0;i<data.length;i++) {
				temp[i]=data[(front+i)%data.length];
			}
			front=0;
			end=data.length;
			data=temp;
		}
		return super.insert(item);
	}
}
