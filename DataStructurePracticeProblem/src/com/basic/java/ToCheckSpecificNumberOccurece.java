package com.basic.java;
public class ToCheckSpecificNumberOccurece {

	public static void main(String[] args) {

		int n=13839;
		int count=0;
		while(n>0) {
			int rem=n%10; //(13839%10=9) so remainder=9
			if(rem==3) {
				count++;
			}
			n=n/10;  //	(13839/10=1383) each time last no get deleted

		}
		System.out.println(count);
		
		
	}

}
