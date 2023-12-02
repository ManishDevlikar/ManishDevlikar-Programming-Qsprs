package qspiders.constructor;
//Example of constructor Chaining
public class ConChain {
	{
		System.out.println("im instace Block: 1");
	}
	int id;
	String name;
	ConChain(){
		
	}
	ConChain(int id){
		this.id=id;
	}
	ConChain(int id,String name){
		
		this(id);
		this.name=name;
	}
	public static void main(String[] args) {
		ConChain c1=new ConChain(1,"raj");

		System.out.println(c1.id);

	}
	{
		System.out.println("im instace Block: 2");
	}

}
