package com.binary.search;

public class FindSmallestLetterGreaterThanTarget {
  static char nextGreatestLetter(char[] letters,char target) {
	  int start=0;
	  int end=letters.length-1;
	  while(start<=end) {
		  int mid=start+(end-start)/2;
		  if(target<letters[mid]) {
			  end=mid-1;
		  }else {
			  start=mid+1;
		  }
	  }
	  return letters[start%letters.length];
  }
	public static void main(String[] args) {
		char[] letters={'c','d','e','f'};
		char target='d';
		System.out.println(nextGreatestLetter(letters,target));

	}

}
