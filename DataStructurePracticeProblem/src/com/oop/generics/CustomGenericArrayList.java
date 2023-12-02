package com.oop.generics;

	import java.util.Arrays;

	public class CustomGenericArrayList<T> {

		private Object[] data;
		private static int DEFAULT_SIZE=10;
		private int size=0;
// can not create instance of type parameter		
		public CustomGenericArrayList() {
			data = new Object[DEFAULT_SIZE]; 
		}
		public void add(T num) {
			if(this.isFull()) {
				resize();
			}
			data[size++]=num;
		}

		private void resize() {
			Object [] temp=new Object[data.length*2];	
			// copy the current item in new array
			for(int i=0;i<data.length;i++) {
				temp[i]=data[i];
			}
			data=temp;
		}
		private boolean isFull() {
			
			return size==data.length;
		}
		public T remove() {
			T remove=(T)(data[--size]);
			return remove;
		}
		public T get(int index) {
			return (T)(data[index]);
		}
		public int size() {
			return size;
		}
		public void set(int index, T value) {
			data[index]=value;
		}
		public static void main(String[] args) {
			CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
			list.add(3);
			list.add(3);
			list.set(3,4);
			System.out.println(list);
		}
		@Override
		public String toString() {
			return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
		}
	}
