package qspiders.methods;

public class Ex {
	
	int i;
	 Ex (){ 
		 i=500;
		 System.out.println("constructor");
		 this.nonStaticM();
		 staticM();
		 System.out.println(this);
		 this.i=1000;
	 }
	 
	 public static void staticM() {
		 System.out.println("Static Method");
	 }
	 public void nonStaticM() {
		 System.out.println("Non Static Method");
	 }

	public static void main(String[] args) {
		
		Ex x1 =new Ex();
		System.out.println(x1);
//		x1.i=100;
		System.out.println("ref 1: "+x1.i);
		Ex x2 = new Ex();
		System.out.println(x2);
//		x2.i=200;
		System.out.println("ref 2: "+x2.i);
		System.out.println("ref 1: "+x1.i);
		Ex x3 = new Ex();
		System.out.println(x3);
		System.out.println("ref 3: "+x3.i);
	}

}
