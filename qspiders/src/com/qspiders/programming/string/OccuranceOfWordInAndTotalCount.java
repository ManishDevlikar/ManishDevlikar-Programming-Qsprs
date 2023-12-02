package com.qspiders.programming.string;

public class OccuranceOfWordInAndTotalCount {
	public static void main(String[] args) {
		String str = "java programming langauge is used to do java programming java";
		String[] str1 = str.split(" ");
		boolean[] b = new boolean[str1.length];
		int total = 0;
		for (int i = 0; i < str1.length; i++) {

			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < str1.length; j++) {
					if (str1[i].equals(str1[j])) {
						count++;
						b[j] = true;
					}
				}
				if (count > 1) {
					total++;
					System.out.println(str1[i] + " " + count);
				}
			}
		}
		System.out.println(total);
	}
}
