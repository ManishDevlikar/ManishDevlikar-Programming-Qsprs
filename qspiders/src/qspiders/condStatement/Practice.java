package qspiders.condStatement;

public class Practice {
	public static void main(String[] args) {

		String input="&";
	if(input=="0"||input=="1"||input=="2"||input=="3"||input=="4"||input=="5"||input=="6"||input=="7"||input=="8"||input=="9") {
		System.out.println(input+ " is a Number");
	}else if(input=="B"||input=="C"||input=="D"||input=="F"||input=="G"||input=="H"||input=="J"||input=="K"||input=="L"||input=="M"||input=="N"||input=="P"||input=="Q"||input=="R"||input=="S"||input=="T"||input=="V"||input=="W"||input=="X"||input=="Y"||input=="Z") {
		System.out.println(input+" is Character");
		System.out.println("Consonent");
	}else if(input=="A"||input=="E"||input=="I"||input=="O"||input=="U") {
			System.out.println(input+" is a character");
			System.out.println("Vowel");
	}else if(input=="b"||input=="c"||input=="d"||input=="f"||input=="g"||input=="h"||input=="j"||input=="k"||input=="l"||input=="m"||input=="n"||input=="p"||input=="q"||input=="r"||input=="s"||input=="t"||input=="v"||input=="w"||input=="x"||input=="y"||input=="z") {
		System.out.println(input+" is Character");
		System.out.println("Consonent");
	}else if(input=="a"||input=="e"||input=="i"||input=="o"||input=="u") {
			System.out.println(input+" is a character");
			System.out.println("Vowel");
	}else if(input=="!"||input=="@"||input=="#"||input=="$"||input=="%"||input=="^"||input=="&"||input=="*"||input=="?") {
		System.out.println(input+" is a special symbol");
	}
  }
}


