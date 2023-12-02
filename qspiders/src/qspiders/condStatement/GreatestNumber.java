package qspiders.condStatement;

public class GreatestNumber {

	public static void main(String[] args) {
		System.out.println("Greatest Number: "+greatest(500,100,20)+"\n");
		System.out.println("Without function\n");
		
		int num1=105;
		int num2=200;
		int num3=308;
		if(num1>num2&&num1>num3) {
			System.out.println("Greatest No is "+num1);
		}
		else if(num2>num1&&num2>num3) {
			System.out.println("Greatest No is "+ num2);
		}else {
			System.out.println("Greatest No is "+ num3);
		}
		
	}
	 public static int greatest(int num1,int num2,int num3) {
		if(num1>num2&&num1>num3) {
			return num1;
		}
		else if(num2>num1&&num2>num3) {
			return num2;
		}else {
			return num3;
		}
	}

}
