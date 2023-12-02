package com.qspiders.programming.string;

public class OccuranceOfWordInSentance {
	public static void main(String[] args) {
		String str = "java programming langauge is used to do java programming";

		String[] str1 = str.split(" ");
		boolean[] b = new boolean[str.length()];
		for (int i = 0; i < str1.length; i++) {

			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < str1.length; j++) {
					if (str1[i].equals(str1[j])) {
						count++;
						b[j] = true;
					}
				}
				System.out.println(str1[i] + " " + count);
			}
		}
	}
}
