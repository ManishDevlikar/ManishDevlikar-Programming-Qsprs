package com.data.stucture;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimentionalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			ArrayList<ArrayList<Integer>> list= new ArrayList<>();
			// initalisation
			for(int i=0;i<3;i++) {
				list.add(new ArrayList<>());
			}
			
			// add element
			for(int i=0;i<3;i++) {
				for(int j=0; j<3;j++) {
					list.get(i).add(sc.nextInt());
				}
			}
			System.out.println(list);
	}

}
