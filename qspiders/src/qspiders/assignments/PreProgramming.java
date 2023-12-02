package qspiders.assignments;

public class PreProgramming {

	public static void main(String[] args) {

		String input="!";
	if(input=="0"||input=="1"||input=="2"||input=="3"||input=="4"||input=="5"||input=="6"||input=="7"||input=="8"||input=="9") {
		System.out.println(input+ " its a Number");
	}else if(input=="a"||input=="b"||input=="c"||input=="d"||input=="e"||input=="f"||input=="g"||input=="h"||input=="i"||input=="j"||input=="k"||input=="l"||input=="m"||input=="n"||input=="o"||input=="p"||input=="q"||input=="r"||input=="s"||input=="t"||input=="u"||input=="v"||input=="w"||input=="x"||input=="y"||input=="z"||input=="A"||input=="B"||input=="C"||input=="D"||input=="E"||input=="F"||input=="G"||input=="H"||input=="I"||input=="J"||input=="K"||input=="L"||input=="M"||input=="N"|| input=="O"||input=="P"||input=="Q"||input=="R"||input=="S"||input=="T"||input=="U"||input=="V"||input=="W"||input=="X"||input=="Y"||input=="Z") {
	 if(input=="A"||input=="B"||input=="C"||input=="D"||input=="E"||input=="F"||input=="G"||input=="H"||input=="I"||input=="J"||input=="K"||input=="L"||input=="M"||input=="N"|| input=="O"||input=="P"||input=="Q"||input=="R"||input=="S"||input=="T"||input=="U"||input=="V"||input=="W"||input=="X"||input=="Y"||input=="Z") {
			System.out.println(input+" is a Uppercase character");
			if(input=="A"||input=="E"||input=="I"||input=="O"||input=="U") {
				System.out.println(input+" is an vowel");
			}else {
				System.out.println(input+" its a consonant");
			}
	 }else if(input=="a"||input=="b"||input=="c"||input=="d"||input=="e"||input=="f"||input=="g"||input=="h"||input=="i"||input=="j"||input=="k"||input=="l"||input=="m"||input=="n"||input=="o"||input=="p"||input=="q"||input=="r"||input=="s"||input=="t"||input=="u"||input=="v"||input=="w"||input=="x"||input=="y"||input=="z"){
		 System.out.println(input+" is a lower Character");
		 if(input=="a"||input=="e"||input=="i"||input=="o"||input=="u") {
			 System.out.println(input+" is an vowel");
		 }else {
			 System.out.println(input +" is a consonant");
		 }
	 }
	}else if(input=="!"||input=="@"||input=="#"||input=="$"||input=="%"||input=="^"||input=="&"||input=="*"||input=="?") {
		System.out.println(input+" is a special symbol");
	}
  }

}
