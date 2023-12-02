package qspiders.assignments;

public class Ex {
	public static void main(String[] args) {

	char ch='!';
		
		if(ch>='A'&& ch<='Z') {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println("Uppercase Vowel");
			}else {
				System.out.println("Uppecase Consonant");
			}
		}else if(ch>='a'&& ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("Lowercase Vowel");
			}else {
				System.out.println("Lowercase Consonant");
			}
		}else if(ch>='0'&&ch<='9') {
			System.out.println("Number");
		}else {
			System.out.println("Special Character");
		}
		
		
  }
}
